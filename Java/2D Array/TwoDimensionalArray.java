//Jennifer Bochenek
//JLB599

import java.util.Scanner;
public class TwoDimensionalArray
{
   //Variables
   double sales[][] = new double[5][4];
   int sale_person;
   int product;
   double value;
   int i, j;
   double[] product_total = new double[5];

   double sale_person_total;  
   
   public void Sales()
   //input
   {
      Scanner input = new Scanner(System.in); //allows input of variables
	 
	  
	  System.out.print ("Enter sales person number (-1 to end) : "); //first input
	  sale_person = input.nextInt(); //assign to sale_person
     while (sale_person != -1) { //continue to rest of input as long as end number (-1) isn't input
	     System.out.print("Enter product number: "); //second input
        product = input.nextInt(); //assign to product
    
        System.out.print("Enter sales amount: "); //third input
        value = input.nextDouble(); //assign to value
        if (sale_person >= 1 && sale_person < 5 && product >= 1 && product < 6 && value >= 0){ //if the input is within ranges
         sales[product-1][sale_person-1] = value;} //assign the input to the array!
         else {
            System.out.print("Invalid response, please start over"); //if the input is bad, it doesn't assign to array, says that it's invalid and the code goes back to user input

            }
      System.out.print("Enter sales person number (-1 to end): "); //prompts for user input for the sale_person again
	   sale_person = input.nextInt(); //assuming that is not -1, it goes to enter product number next, which allows data entry to the array until data is complete.
   			}
	  
	  

	  //calculations and output
		 
	  System.out.printf("%6s%12s%12s%12s%12s%11s\n", "Product", "Person 1",
	     "Person 2", "Person 3", "Person 4","Total"); //output of header with spacing
	   for (i = 0; i < 5; i++) //iterates through rows
	   {
	    sale_person_total = 0.0; //fills sale_person_total table with 0.0 first, where there are values in array, they will be written over the 0.0 spots
		 System.out.printf("%6d", (i + 1));
		 
		 for (int j = 0; j < 4; j++) //iterates through columns
		 { 
         sale_person_total += sales[i][j]; 
         System.out.printf("%12.2f", sales[i][j]);
         product_total[j] += sales[i][j];
		  			
		 } 
		 
		 System.out.printf("%12.2f\n", sale_person_total);
		 
	  }
	  
	  System.out.printf("%6s", "Total");
     for (i = 0; i<4;i++) //iterates through rows again to print product totals
	  System.out.printf("%12.2f", product_total[i]);
	  
	  System.out.println();
	 }
   }
   
   
   


