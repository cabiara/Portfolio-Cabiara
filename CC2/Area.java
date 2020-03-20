
package area;
import java.util.Scanner;

public class Area {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius of circle.");
        double rad = sc.nextDouble();
        double carea = Math.PI*(Math.pow(rad, 2));
        System.out.println("Area of the circle is "+carea);
        
        System.out.println("------------------------------------------");
        System.out.println("Enter sides of square.");
        double sid = sc.nextDouble();
        double sarea = Math.pow(sid, 2);
        System.out.println("Area of the square is "+sarea);
        
        System.out.println("------------------------------------------");
        System.out.println("Enter base of triangle");
        double base = sc.nextDouble();
        System.out.println("Enter height of triangle");
        double height = sc.nextDouble();
        double tarea = (base*height)/2;
        System.out.println("Area of the triangle is "+tarea);
    }  
}
