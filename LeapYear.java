//6. Write a java program to check if input year is leap year or not

import java.util.*;

public class LeapYear {
    public static boolean isLeap(int year){
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean val = isLeap(year);
        if(val==true){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }


}

//Output:
//        2020
//        2020 is a leap year
//
//        Process finished with exit code 0

