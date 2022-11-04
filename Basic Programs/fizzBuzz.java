import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Number:");
        int n = scan.nextInt();
                if(n%5==0){
                    if(n%3==0)
                    System.out.println("FizzBuzz");
                    else 
                    System.out.println("Fizz");
        }
        else if(n%3==0)
            System.out.println("Buzz");
        else
        System.out.println(n);
    }
    
}
 