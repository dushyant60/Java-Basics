import java.util.Scanner;

public class multiplyTwoFloatingNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        float a = scan.nextFloat();
        System.out.print("Enter the Second Number:");
        float b = scan.nextFloat();

        float c = a*b;

        System.out.println("The Multiplication of these two number is :" + c);
    }
    
}
