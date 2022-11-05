import java.util.Scanner;

public class addTwoBinaryString {
  public static void main(String[] args) {

// BY USING WHILE IF:    

    // Scanner scan = new Scanner(System.in);
    // System.out.print("Enter the First Binary Number: ");
    // long num1 = scan.nextLong();
    // System.out.print("Enter the Second Binary Number: ");
    // long num2 = scan.nextLong();

    // int i = 0, carry = 0;
    // int[] binary_sum = new int[10];
       
    // while (num1 != 0 || num2 != 0) {
    //     binary_sum[i++] = (int) (carry + (num1 % 10 + num2 % 10) % 2);
    //     carry = (int) ((num1 % 10 + num2 % 10 + carry) / 2);
    //     num1 = num1 / 10;
    //     num2 = num2 / 10;
    //  }

    //  if (carry != 0) {
    //     binary_sum[i++] = carry;
    //  }
    //  --i;
    //  System.out.print("The sum of the binary numbers is: ");
    //  while (i >= 0) {
    //     System.out.print(binary_sum[i--]);
    //  }
    //  System.out.print("");


//#####################################################################################################################

// BY USING PARSEINT:

     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the First Binary Number: ");
     String num1 = scan.next();
     System.out.print("Enter the Second Binary Number: ");
     String num2 = scan.next();

     int n1 =Integer.parseInt(num1,2);
     int n2 = Integer.parseInt(num2,2);
     int n3 = n1+n2;

     System.out.println("The Sum of Two Binary Number is: " + Integer.toBinaryString(n3));
  }
}