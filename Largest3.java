//18. Write a java program to calculate the largest number from the given three numbers using
//        ternary operator.

import java.util.*;
public class Largest3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1= input.nextInt();
        int n2 = input.nextInt();
        int n3= input.nextInt();

        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Max of the three numbers is " +max);
    }
}

//output:
//        5
//        3
//        2
//        Max of the three numbers is 5