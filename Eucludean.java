
package eucludean;

import java.util.Scanner;
public class Eucludean {  
    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in); 
      System.out.println("enter 2 numbers:");
      int p=obj.nextInt();
      int q=obj.nextInt();
      int d;
       d = gcd(p ,q);
       System.out.println("gcd("+ p +","+ q +")="+d);
       
    }
    }
   
