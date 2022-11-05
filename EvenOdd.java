public class EvenOdd {
    public static void main( String[] args) {
    
    // BY USING BRUTE FORCE:
        
        int num = 9;
        if ((num % 2) == 0) {
            System.out.println("Entered Number is Even");
        }
 
        else {
            System.out.println("Entered Number is Odd");
    }

// ######################################################################################################################

    // USINg OR OPERATOR:

//     int num = 9;
//     if ((num | 1) > num) {
//         System.out.println("Entered Number is Even");
//     }

//     else {
//         System.out.println("Entered Number is Odd");
// }

// ##################################################################################################################
 
//  USING AND OPERATOR:

// int num = 9;
// if ((num & 1) == 0) {
//     System.out.println("Entered Number is even");
// }

// else {
//     System.out.println("Entered Number is odd");
// }
    

// ##################################################################################################################

// BY CHECKING LEAST SIGNIFICANT BIT:

// if (num != 0){
//     if(Integer.toBinaryString(num).endsWith("0")){
//         return "even";
//     }
//     else{
//         return "odd";
//     }

    
// }
// else {
//     return "Zero";
// }


}
}
