public class Triangle extends Shape_2D
{
    private double x;
    private double y;
    private String type;

    public Triangle(double x, double y){
      type = "Triangle";
      if (x <= 0 || y <= 0){
         System.out.println("Cannot calculte with dimensions less than or equal to zero or blank.");
         }
      this.x = x;
      this.y = y;
      
      }
    public double getArea(){
      return((x*y)/2);}
      
    public String getType(){
      return type;}
}