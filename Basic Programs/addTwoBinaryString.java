import java.util.Scanner;

public class addTwoBinaryString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the First Binary Number: ");
    long num1 = scan.nextLong();
    System.out.print("Enter the Second Binary Number: ");
    long num2 = scan.nextLong();

    int i = 0, carry = 0;
    int[] binary_sum = new int[10];
       
    while (num1 != 0 || num2 != 0) {
        binary_sum[i++] = (int) (carry + (num1 % 10 + num2 % 10) % 2);
        carry = (int) ((num1 % 10 + num2 % 10 + carry) / 2);
        num1 = num1 / 10;
        num2 = num2 / 10;
     }

     if (carry != 0) {
        binary_sum[i++] = carry;
     }
     --i;
     System.out.print("The sum of the binary numbers is: ");
     while (i >= 0) {
        System.out.print(binary_sum[i--]);
     }
     System.out.print("");

  }
}