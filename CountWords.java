//13. Write a java program to count the number words in a string
import java.util.*;
public class CountWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String[]  s2 = s1.split(" ");
        System.out.println(s2.length);

    }
}
//Output:
//        Hello World
//2
//
//        Process finished with exit code 0
