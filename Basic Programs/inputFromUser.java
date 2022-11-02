import java.io.*;
import java.util.Scanner;
public class inputFromUser {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Integer:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("The entered String is:" + num);

        
    }
}
