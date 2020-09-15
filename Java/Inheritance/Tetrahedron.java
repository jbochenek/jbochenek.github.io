public class Tetrahedron extends Shape_3D
{
   private double x;
   private String type;

   public Tetrahedron(double x){
      type = "Tetrahedron";
      if (x <= 0){
         System.out.println("Cannot calculate with dimensions less than or equal to zero or blank.");
         }
      this.x = x;}
   public double getArea(){
      return (Math.sqrt(3) * Math.pow(x, 2));}
   public double getVolume(){
      return Math.pow(x, 3) / (6 * Math.sqrt(2));}
   
   public String getType(){
      return type;}
}