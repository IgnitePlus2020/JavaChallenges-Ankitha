//5. Write a java program to check if given number is a perfect square.

import java.util.*;

public class PerfSquare {


    public static boolean isSquare(int n) {
        int i =0;
        while(i<n/2){
            if(i*i == n){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean val = isSquare(n);
        if (val == true) {
            System.out.println("The number is a perfect square");
        } else {
            System.out.println("The number is not a perfect square");
        }
    }
}
//Output:
//
//25
//        The number is a perfect square
//
//        Process finished with exit code 0