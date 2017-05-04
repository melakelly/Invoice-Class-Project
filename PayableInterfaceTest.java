import java.util.InputMismatchException;
import java.util.Scanner;

public class PayableInterfaceTest 
{
	public static void main( String args[] )
	   {	  
		Scanner input = new Scanner( System.in); //initializing scanner
		
		try {
			int Number = 0;
			
			System.out.print( "How many invoices do you need to enter?"); //enter value 1
		    Number = input.nextInt();
		    
			// create four-element Payable array
		    Payable payableObjects[] = new Payable[ Number+3];
		    
		    // populate array with objects that implement Payable
		    payableObjects[ 0 ] = new Invoice( "01234", "candy", 2, 375.00, "done" );
		    payableObjects[ 1 ] = new Invoice( "56789", "bread", 4, 79.95, "unpaid" );
		    payableObjects[ 2 ] = new Invoice( "01234", "peanuts", 2, 375.00, "unpaid" );
		   
		    //for loop for additional entries
		    for (int i = 0; i < Number; i++) {
		  	  
		  	  System.out.print( "Customer Number: "); //enter number
		  	  String custnumber = input.next();
		  	  System.out.print( "Description: "); //enter description
		  	  String description = input.next();
		  	  System.out.print( "Quantity: "); //enter quality
		  	  int quantity = input.nextInt();
		  	  System.out.print( "Price: "); //enter price
		  	  float price = input.nextFloat();
		  	  payableObjects[i+3] = new Invoice( custnumber, description, quantity, price, "unpaid" );
		    }
		    
		      System.out.println( "\n\nInvoices processed:\n" ); 
		
		      float sum = 0; 
		      // generically process each element in array payableObjects
		      for ( Payable currentPayable : payableObjects )
		      {    
		    	  String str = "unpaid";
		       	  if ( currentPayable.getPaid().contains(str) ) {      
	
					System.out.printf( "%s \n%s: $%,.2f\n\n", 
							currentPayable.toString(), 
							"payment due", currentPayable.getPaymentAmount() ); 
		         
		        	 sum = (float) (sum + currentPayable.getPaymentAmount());	 
	       	  }
	       	  else {
	       		System.out.printf( "%s \n%s: $%,.2f\n\n", 
	       	            currentPayable.toString(), 
	       	            "payment due", currentPayable.getPaymentAmount() ); 
	       	  }

	      } // end for
	    	      
    	System.out.printf("Total due: $%,.2f\n\n\n", sum);

	      System.out.print( "How many customers do you need to enter?"); //enter value
	      int cNumber = input.nextInt();
	
	      Customers customerObjects[] = new Customers[ cNumber+3 ];
	      
	      // populate array with objects that implement Customers
	      customerObjects[ 0 ] = new Customer( "01234", "Main Inc" );
	      customerObjects[ 1 ] = new Customer( "56789", "Red Wheel" );
	      customerObjects[ 2 ] = new Customer( "01234", "AMC Corp" );
	      
	      //for loop for additional objects
	      for (int i = 0; i < cNumber; i++) {
	    	  
	    	  System.out.print( "Customer Number: "); //enter Customer number
	    	  String custnumber = input.next();
	    	  System.out.print( "Company Name: "); //enter Company name
	    	  String description = input.next();
	    	  customerObjects[i+3] = new Customer( custnumber, description);
	      }
	      
	           
	      System.out.println( 
	 	         "\n\nCurrent Customers:\n" ); 
	      
	      for ( Customers currentCustomers : customerObjects )
	      {    
				System.out.printf( "%s \n\n", 
						currentCustomers.toString() ); 
	      } // end for
		}
		
		catch (InputMismatchException e){
			System.out.print( "ERROR: Please enter a number that is 0 or positive\n"); //Error message
			input.nextInt();
		}
		
		catch(Exception e){
			System.out.print( "ERROR: Please enter a number that is 0 or positive\n"); //Error message
			input.nextInt();
		}
      
   } // end main
} // end class PayableInterfaceTest