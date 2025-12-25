// import java.util.*;

// class Reversenum{

//  static int Reversed(int num){
//     int rev=0;
//     while(num!=0){
//     int digit = num%10;
//     rev=10*rev+digit;
//     num=num/10;
//     }
 
//  return rev;
// }

// public static void main ( String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number to reverse:");
// int n = sc.nextInt();
// sc.close();
// System.out.println("reversed num is:"+Reversed(n));
// }

// }




// ----------------Gpt optimized -----------------

import java.util.*;

class ReverseNumber {

    static int reverseNumber(int num) { //naming convension 
        int rev = 0;
        int sign = num < 0 ? -1 : 1; // handle negative numbers
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Reversed num is: " + reverseNumber(n));
    }
}
