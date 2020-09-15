//Jennifer Bochenek



import java.util.Scanner; //loads in the ability to use user input
import java.util.regex.Pattern;

public class Palindrome 
{ 
    public static void main (String[] args) 
    { 
    
    //SET UP
    Scanner pally = new Scanner(System.in); //Creates a scanner with the ability to parse the user input
    Scanner yesno = new Scanner(System.in);
    //VARIABLE DECLARATION
    String str;
    String yn;
    //INPUT
    do { //I wrapped the input and output in a do while loop to run palindromes as many times as needed
    System.out.print("Type in a string to be evaluated: "); //Directions for how to use and user input.
    str = pally.nextLine(); 
    //System.out.println(Pattern.compile(".*[^\\s*]").matcher(str).matches()); //Return if input value is true or false, for debugging the Regex
    /*This section is to catch valid input, basically there needs to be at least 1 valid input*/
    while (!Pattern.compile(".*[^\\s*]").matcher(str).matches()) //See more about regex in README
         {
         System.out.print("Please enter a valid string to be evaluated: "); 
         str = pally.nextLine();
         }


    //OUTPUT
    if (palinrec(str) == true) {
      System.out.println("The Recursive Solution: the string '" +str+"' is a palindrome.");}
      else System.out.println("The Recursive Solution: The string '" +str+"' is NOT a palindrome.");
    if (paliniter(str) == true) {
      System.out.println("The Interative Solution: the string '" +str+"' is a palindrome.");}
      else System.out.println("The Interative Solution: the string '" +str+"' is NOT a palindrome.");
    System.out.print("Do you want to test another palindrome (y/n)?: ");
    yn = yesno.next();
   } while (yn.equalsIgnoreCase("y")||yn.equalsIgnoreCase("yes")); //so y and Y are captured, and yes or YES as a precaution
   }
    //CLASSES
    /*ITERATIVE SOLUTION*/
    public static boolean paliniter(String str) {
      //Variables
      int len, up, down;
      char upChar, downChar;
      len = str.length();
      up = 0;
      down = len - 1;
      //Calculations & Output
      if (len == 1) {return true;} //All strings of length 1 are by def palindromes, no need to test
      
      while (up < down) {
        upChar = str.charAt(up++); //Count up to the index of the next char and assign it to upChar (also increments the up int, which also controls the loop)
        downChar = str.charAt(down--); //Count down to the index of the next char and assign it to downChar (also increments the down int, which also controls the loop)
        //System.out.println(up + " "+ upChar +" "+ down + " "+ downChar); //This is a code to check that the upstream and downstream variables worked correctly
        if (upChar != downChar)
            return false; //To save time/processing power, you don't have to check every letter. If there is char mismatch it cannot be a palindrome.
        }
      return true; //If you go through whole thing without returning false...it must be true!
    }
   
    /*RECURSIVE SOLUTION*/
    public static boolean palinrec(String str) {
      //Variables
      int len;
      len = str.length();
      //Calculations & Output
      if (len == 1 || len == 0){return true;} //All strings of length 1 are by def palindromes, no need to test. The len = 0 was added to handle an error for even length palindromes dialing down to 0 characters and having no exit status.
      //System.out.println(str.charAt(0) + " "+ str.charAt(len - 1)); //This is a print to check that the data dials down correctly
      if(str.charAt(0) == str.charAt(len - 1)){ //if character at index = 0 and index len - 1 are equal then drill down to next one.
         return palinrec(str.substring(1, len - 1));
         } //the call of substring 1 and len - 1 means that it pares off the two ending chars (previously compared) to go through the process again
         else return false; 
    }
}