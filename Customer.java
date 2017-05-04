
public class Customer implements Customers {
	   private String custNumber; 
	   private String companyName;
	   
	   public Customer( String cust, String company)
		{
		   	custNumber = cust;
		   	companyName = company;
		} // end four-argument Customer constructor
	   
	   // set customer number
	   public void setNumber( String cust )
	   {
		   custNumber = cust;  
	   } // end method setNumber

	   // get customer number
	   public String getNumber()
	   {
	      return custNumber;
	   } // end method getNumber
	   
	   // set company name
	   public void setCompany( String company )
	   {
		   companyName = company;
	   } // end method setCompany

	   // get company name
	   public String getCompany()
	   {
	      return companyName;
	   } // end method getCompany
	   
	   public String toString()
	   {
	      return String.format( "%s: %s \n%s: %s", 
	         "Customer number", getNumber(), "Company name", getCompany());
	      
	   } // end method toString
}
