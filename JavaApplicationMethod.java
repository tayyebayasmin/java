package javaapplicationmethod;
import java.util.Scanner;
public class JavaApplicationMethod {
   
public static int Square(int value)
{
return value * value;
}
 public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     System.out.print("enter a number:");
     int p=obj.nextInt();
  System.out.println("double of" + p + " is " + Square(p));
     
    }
    
}
