public class Circle extends Shape_2D
{
   private double z;
   private String type;

   public Circle(double z){
      type = "Circle";
      if (z <= 0){
         System.out.println("Cannot calculte with dimensions less than or equal to zero or blank.");
         }
      this.z = z;}
   public double getArea(){
      return (Math.pow(z, 2)*Math.PI);}
   
   public String getType(){
      return type;}
      
} 