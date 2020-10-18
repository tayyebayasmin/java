
package javaapplicationelse;
import java.util.Scanner;
public class JavaApplicationElse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter marks:");
        int x=obj.nextInt();
        
    if (x > 50)
    {
        System.out.println("pass");
    }
else
    {
        System.out.println("fail");
    }
    }
    
}
