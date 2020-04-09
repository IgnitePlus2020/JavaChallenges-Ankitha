//12. Write a java program to concatenate two strings.
import java.util.*;
public class Concatenate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        String s3 = s1+" " +s2;
        System.out.println(s3);

    }

}
//Output
//        Hello
//         world
//        Hello world
//
//        Process finished with exit code 0