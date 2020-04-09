//19. Write a java program to check whether given number is an ugly number.
//        Note: In number system, ugly numbers are positive numbers whose only prime factors are
//        2,3,5.
import java.util.*;
public class UglyNum {

    public static boolean isUgly(int n){
        if(n>0){
            for(int i = 4;i<n/2;i++){
             if(i!=5){
                 if(n%i == 0){
                     return false;
                 }
             }
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean val = isUgly(n);
        if(val == true){
            System.out.println("Number is ugly");
        }
        else{
            System.out.println("Number is not ugly");
        }
    }
}

//output:
//        10
//        Number is ugly
//
//        Process finished with exit code 0
