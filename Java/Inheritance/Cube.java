public class Cube extends Shape_3D
{
private double x;
private String type;

public Cube(double x){
   type = "Cube";
         if (x <= 0){
         System.out.println("Cannot calculate with dimensions less than or equal to zero or blank.");
         }
   this.x = x;}
   
      public double getArea(){
         return (6 * Math.pow(x, 2));} //area
      public double getVolume(){
         return (Math.pow(x, 3));} //volume
      public String getType(){
         return type;}
}