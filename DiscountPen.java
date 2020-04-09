//3. A pen costs 50$ and it is been sold at a discount of 12%, Write a program to display discount amount and selling price of the pen?

import java.util.*;

public class DiscountPen {
    public static void main(String[] args){
        int cost = 50;
        int discount = 12;
        double disAmount = (50*12)/100;
        double sellPrice = 50-disAmount;
        System.out.println("The Discount amount = "+disAmount);
        System.out.println("The amount paid = "+sellPrice);
    }
}


//Output:
//        The Discount amount = 6.0
//        The amount paid = 44.0
//
//        Process finished with exit code 0