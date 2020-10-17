
package euclid;
import java.util.Scanner;
public class Euclid {
           public static int gcd(int p,int q)
    {
        if(q==0)
            return p;
        else return gcd(q,p%q);
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
   
