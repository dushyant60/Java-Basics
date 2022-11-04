import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//BufferedReader Method

public class readInputFromConsole {
    public static void main(String[] args) 
        throws IOException
        {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                System name = reader.readLine();
                System.out.println(name);
        }
    }


// Java program to demonstrate working of Scanner in Java

// public class readInputFromConsole{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the Value:");
//         int a = scan.nextInt();
//         System.out.println("The entered value is " + a); 
//     }

// }


//Using Console Class

// public class readInputFromConsole{
//     public static void main(String[] args) {
//         String value = System.console().readLine();
//         System.out.println("The entered value is " + value);
        
//     }
    
// }