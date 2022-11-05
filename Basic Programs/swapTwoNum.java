import java.util.*;
import java.util.Scanner;

public class swapTwoNum {
    public static void main(String[] args) {
        
        //By USING THIRD VARIABLE:
        
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter n:");
        // int n = scan.nextInt();
        // System.out.print("Enter m:");
        // int m = scan.nextInt();

        // System.out.println("Before Swapping: n = "+ n + " and m =" + m);

        // int temp = n;
        // n=m;
        // m=temp;

        // System.out.println("After Swapping n = " + n + " and m = " + m);   


    // ################################################################################################################

        // BY USING SUM AND DIFFERENCE CONCEPTS OF MATHS:

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // int a = scan.nextInt();
        // System.out.print("Enter b: ");
        // int b = scan.nextInt();

        // b = b - a;
        // a = a + b;
        // b = a - b;

        // System.out.println("After Swapping a = " + a + " and b = " + b);


    // #################################################################################################################


        // BY USING OPERRATOR
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After Swapping a = " + a + " and b = " + b);

    }
} 
