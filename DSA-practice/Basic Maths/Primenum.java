import java.util.*;

class Primenum {

    //brute force ( O(n))
    //function 1

    boolean isprimenumber(int num){
       if (num <= 1) return false; //edge case if number is negative 
       if (num == 2) return true;   // 2 is prime

        for ( int i=2;i<num;i++){
            if (num%i ==0){
                return false;
            }
        }
     return true;   
    }




public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();

Primenum obj= new Primenum();

 if (obj.isprimenumber(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }

}

}

/* 

edge case 
1. handle 2 is a prime 
2. handle negative number 


optimization 

*/


