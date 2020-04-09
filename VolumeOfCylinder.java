//2. Write a java program to calculate the volume of the cylinder.


import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();

        double volume = ((22*r*r*h)/7);
        System.out.println("Volume of a cylinder = "+volume);
    }
}

//Output:
//        5
//        10
//        Volume of a cylinder = 785.7142857142857
//
//        Process finished with exit code 0

