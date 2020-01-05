import java.util.Scanner;


public class assignment_7 {
  
  

   private double radius;
   private final double PI=3.14159;

   public assignment_7(double radius) {
      
       this.radius=radius;
       
   }
   public assignment_7() {
       
       this.radius=0.0;
      
   }

   public double area() {
       
       return (PI*radius*radius);
   }

  
   public double circumference() {
       
      
       return (2*PI*radius);
   }

   public double diameter()
   {
       return 2*radius;
   }
  
   public void setRadius(double radius)
   {
       this.radius=radius;
   }
  
   public double getRadius()
   {
       return radius;
   }
  
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter radius:");
       double r=sc.nextDouble();
       assignment_7 c=new assignment_7(r);
       System.out.println("Area:"+c.area());
       System.out.println("Circumference:"+c.circumference());
       System.out.println("Diameter"+c.diameter());
   }

}