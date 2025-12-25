import java.util.*;

public class CountDigit {
 public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int num = sc.nextInt();
    sc.close();
    int count=0;
                                 // handle zero explicitly
        if (num == 0) {
            count = 1;
        } else {
            num = Math.abs(num); // handle negative numbers
    while(num!=0){
        count++;
        num=num/10;
    }
    System.out.println ("Total digit is:"+count);
    
 } 

 }
}


/* 
-----------edge cases--------------
1.handle '0'
2.handle negative number 

*/