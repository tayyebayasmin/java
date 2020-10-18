
package javaapplication;

import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
 Scanner obj=new Scanner(System.in);
        int base,power,result=1;
        int i;
        i=1;
        System.out.print("enter base:");
        base=obj.nextInt();
        System.out.print("enter power:");
        power=obj.nextInt();
        while(i<=power)
        {
            result=result*base;
            i++;
        }
        System.out.println("result is:"+result);
    }
    
}
