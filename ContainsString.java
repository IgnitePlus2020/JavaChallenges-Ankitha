//14. Write a java program to read two string user input and check if first contains the second

import java.util.*;
public class ContainsString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        boolean val = s1.contains(s2);
        if(val== true){
            System.out.println("The first string contains the second");
        }
        else{
            System.out.println("The first string does not contain the second");
        }
    }
}
//output:
//        The first string contains the second
//
//        Process finished with exit code 0