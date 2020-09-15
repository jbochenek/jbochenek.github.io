//Jennifer Bochenek

import java.io.File; 
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.util.ArrayList;

public class All_Shapes
{ 
   public static void main( String args[] ) throws Exception {
    // Scanner for user input
    Scanner file = new Scanner( System.in ); 


    // Input file
    File input = new File( "./input.txt" );      
    Scanner scan = new Scanner( input );
    
    //variables
    String type;
    double x, y, z, a;
    ArrayList<Shape> alshapes=  new ArrayList<Shape>();
    
    //calculations
    while (scan.hasNextLine())  {
      if (scan.hasNext()){
         type = scan.next();
         type = type.toLowerCase();} //to handle issues with capitalization
         else {type = "No Shape";} //will go to switch default and end there
      if (scan.hasNextDouble()){
         x = scan.nextDouble();} //read in x coordinate
         else {x = 0;} //zeros will have to be handled in each shape class
      if (scan.hasNextDouble()){
         y = scan.nextDouble();} //read in y coordinate
         else {y = 0;} //zeros will have to be handled in each shape class
      if (scan.hasNextDouble()){   
         z = scan.nextDouble();} //read in the third value, for circles/spheres, this is radius and for everthing else this is sides
         else {z = 0;} //zeros will have to be handled in each shape class
      if (scan.hasNextDouble()){   
         a = scan.nextDouble();} //read in the fourth value, for triangles this is height 
         else {a = 0;} //zeros will have to be handled in each shape class
         
      //switch to create arraylist containing Shape()
      switch (type){
         default:
            System.out.println(type + " is not a valid shape"); //complain a bit
            break;
         case "circle":
            System.out.println("Now calculating a circle");
            alshapes.add(new Circle(z)); //adds the shape to the arraylist
            break;
         case "triangle":
            System.out.println("Now calculating a triangle");
            alshapes.add(new Triangle(z, a)); //adds the shape to the arraylist
            break;
         case "square":
            System.out.println("Now calculating a square");
            alshapes.add(new Square(z)); //adds the shape to the arraylist
            break;
         case "sphere":
            System.out.println("Now calculating a sphere");
            alshapes.add(new Sphere(z)); //adds the shape to the arraylist
            break;
         case "tetrahedron":
            System.out.println("Now calculating a tetrahedron");
            alshapes.add(new Tetrahedron(z)); //adds the shape to the arraylist
            break;
         case "cube":
            System.out.println("Now calculating a cube");
            alshapes.add(new Cube(z)); //adds the shape to the arraylist
            break;

      }
      scan.nextLine(); //fixes issue with infinite loop on scanner.hasNextLine() :(
      } 
      
      //output and amend file
      for (Shape i: alshapes){ //loop through array list and fetch areas and volumes
         if (i instanceof Shape_2D) { 
            String out = new String(); //initialize the string each time to make sure there's nothing there
            out = (i.getType() + " Area: " + i.getArea()); //save the format of the text to write to file (see README)
            System.out.println("The area of " + i.getType() + " is " + i.getArea()); //print out to viewer
            FileWriter fileWriter = new FileWriter("./output.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(out);  
            printWriter.close();}
          
         if (i instanceof Shape_3D) {
            String out = new String(); //initialize the string each time to make sure there's nothing there
            Shape_3D i3 = (Shape_3D) i; //dial down to where .getVolume() is...
            out = (i3.getType() + " Surface Area: " + i3.getArea() + " Volume: " + i3.getVolume()); //save the format of the text to write to file
            System.out.println("The area of " + i3.getType() + " is " + i3.getArea() + " and the volume is " + i3.getVolume()); //print out to viewer          
            FileWriter fileWriter = new FileWriter("./output.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(out);  
            printWriter.close();}
          }
   }

   }
