//11. Write a java program to convert the string totally to uppercase.
import java.util.*;
public class ToUpper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = s1.toUpperCase();
        System.out.println(s2);
    }
}
//Output:
//        hello world
//        HELLO WORLD
//
//        Process finished with exit code 0