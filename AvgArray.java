//7. Write a java program to calculate the average value of the array elements.
import java.util.*;

public class AvgArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        double sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += i;
        }
        double avg = sum/arr.length;
        System.out.println("Average ="+avg);


    }
}
//output:
//        Average =2.0
//
//        Process finished with exit code 0
