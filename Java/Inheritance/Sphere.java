public class Sphere extends Shape_3D
{
private double z;
private String type;

public Sphere(double z){
   type = "Sphere";
         if (z <= 0){
         System.out.println("Cannot calculate with dimensions less than or equal to zero or blank.");
         }
   this.z = z;}
   
      public double getArea(){
         return (4*Math.PI*Math.pow(z,2));} //I'm not a math expert
      public double getVolume(){
         return ((4*Math.pow(z,3)*Math.PI)/3);} //kinda hate this 'program in geometry' stuff, haven't taken that since freshman year of highschool...over 15 years ago. I'm so old...
      public String getType(){
         return type;}
}
