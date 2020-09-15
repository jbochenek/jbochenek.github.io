//Jennifer Bochenek


import java.util.Stack;
import java.util.Scanner;
import java.io.File; 
import java.io.FileWriter;
import java.io.PrintWriter;



public class balancedEquation {
   public static void main( String args[] ) throws Exception {
    {
    // Scanner for user input
    Scanner file = new Scanner( System.in ); 


    // Input file
    File input = new File( "./input.txt" );      
    Scanner scan = new Scanner( input );
    
    // variables
    String bracket;
    String temp;
    
   // input
    while(scan.hasNextLine()){ //a while loop to read in the file line by line
      temp = scan.nextLine();

     
     // calculations and output
         
         if (checkBalance(temp) == false){
            bracket = (temp + " improper" ); 
            FileWriter fileWriter = new FileWriter("./output.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(bracket);  
            printWriter.close();}
            
         if (checkBalance(temp) == true){
            bracket = (temp + " proper" ); 
            FileWriter fileWriter = new FileWriter("./output.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(bracket);  
            printWriter.close();}

        
      }
    }
}

    public static boolean checkBalance(String check)
    {
        Stack<Character> str = new Stack<Character>(); //make a stack!
        for(int a = 0; a < check.length(); a++) //go through each item of the string that has been passed to checkBalance
        {
            char temp2 = check.charAt(a); //assign the char to temp2 for testing
            if(temp2 == '[' || temp2 == '{' || temp2 == '(') //if temp2 is any of these, push it to the stack
                str.push(temp2); //push it!
            else if(temp2 == ']' || temp2 == '}' || temp2 == ')') //else if, i.e., these should be closing items. IF we find one...test to see if the stack has an opening one!
            {
                if(str.empty()) //if the stack is empty, then this is automatically an improper expression!
                    return false; // so we return false
                switch(temp2) //else go to a switch - where it tries to find
                {
                    default: //I like putting my default first, so I don't forget it!
                        break;
                    case ')':
                        if (str.pop() != '(')
                            return false;
                        break;                    
                    case '}': 
                        if (str.pop() != '{')
                            return false;
                        break;
                    case ']':
                        if (str.pop() != '[') //I love that java has pop, it does as described, it pops that element off and checks if there's the match
                            return false; // if there is no [ on the stack, this is an improper expression
                        break;
                }
            }
        }
        if(str.empty()) //if all things have been removed from stack by the end of the loop, then it is a proper expression!
            return true;
        else return false; //if not, if there is something left in the stack, then it is improper
    }
}