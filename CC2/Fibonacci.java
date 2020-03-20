
package fibonacci;
import java.util.Scanner;

public class Fibonacci {

    static int oof(int n){
        if(n == 0 || n ==1){
            return n;
    }
    else{
        return oof(n-1)+oof(n-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number.5");
        int a = sc.nextInt();
        
        for(int b=0; b<=a; b++){
            System.out.print("f("+b+") \t");
        }
        System.out.println("");
        
        for(int b = 0; b <= a; b++){
            for(int c = 0; c<=b; c++){
                System.out.print(oof(c)+"\t");
                
            }
            System.out.println("");
        }
    }
    
    
}
