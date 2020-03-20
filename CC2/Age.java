
package age;
import java.util.Scanner;

public class Age {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your age.");
        int age = sc.nextInt();
        
        if (age>=0&&age<=2){
            System.out.println("You are a baby.");
        }
        else if (age>=3&&age<=5){
            System.out.println("You are a toddler.");
        }
        else if (age>=6&&age<=12){
            System.out.println("You are a kid.");
        }
        else if (age>=13&&age<=19){
            System.out.println("You are a teenager.");
        }
        else if (age>=20&&age<=34){
            System.out.println("You are a young adult.");
        }
        else if (age>=35&&age<=45){
            System.out.println("You are an adult.");
        }
        else if (age>=46&&age<=100){
            System.out.println("You are old.");
        }
        else if (age<0){
            System.out.println("Error. Try again.");
        }   
    }
}
