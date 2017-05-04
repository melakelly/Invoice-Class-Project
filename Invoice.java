public class Invoice implements Payable
{
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;
   private String paid;

   // four-argument constructor
   public Invoice( String part, String description, int count, 
      double price, String paidInfo )
   {
      partNumber = part;
      partDescription = description;
      setQuantity( count ); // validate and store quantity
      setPricePerItem( price ); // validate and store price per item
      paid = paidInfo;
   } // end four-argument Invoice constructor
   
// set customer number
   public void setPartNumber( String part )
   {
      partNumber = part;  
   } // end method setPartNumber

   // get customer number
   public String getPartNumber()
   {
      return partNumber;
   } // end method getPartNumber
   
   // set paid or unpaid
   public void setPaid( String paidInfo )
   {
      paid = paidInfo;  
   } // end method setPaid

   // get paid or unpaid
   public String getPaid()
   {
      return paid;
   } // end method getPaid

   // set description
   public void setPartDescription( String description )
   {
      partDescription = description;
   } // end method setPartDescription

   // get description of item
   public String getPartDescription()
   {
      return partDescription;
   } // end method getPartDescription

   // set quantity
   public void setQuantity( int count )
   {
      quantity = ( count < 0 ) ? 0 : count; // quantity cannot be negative
   } // end method setQuantity

   // get quantity
   public int getQuantity()
   {
      return quantity;
   } // end method getQuantity

   // set price per item
   public void setPricePerItem( double price )
   {
      pricePerItem = ( price < 0.0 ) ? 0.0 : price; // validate price
   } // end method setPricePerItem

   // get price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } // end method getPricePerItem

   // return String representation of Invoice object
   public String toString()
   {
      return String.format( "%s: \n%s: %s \n%s: %s \n%s: %d \n%s: $%,.2f \n%s: %s", 
         "invoice", "customer number", getPartNumber(), "description:", getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem(), 
         "paid", getPaid() );
      
   } // end method toString

   // method required to carry out contract with interface Payable
   public double getPaymentAmount() 
   {
	   return getQuantity() * getPricePerItem(); // calculate total cost
   } // end method getPaymentAmount
} // end class Invoice
