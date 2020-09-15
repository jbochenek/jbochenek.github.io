public class Square extends Shape_2D
{
   private double x;
   private String type;


   public Square(double x){
      type = "Square";
      if (x <= 0){
         System.out.println("Cannot calculte with dimensions less than or equal to zero or blank.");//print this out, but I can't get it to not calculate...
         }
      this.x=x;}
      
   public double getArea(){
      return (Math.pow(x, 2));}
      
   public String getType(){
      return type;}
}