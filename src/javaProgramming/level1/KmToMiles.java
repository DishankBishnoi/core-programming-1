package javaProgramming.level1;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float miles = sc.nextFloat();
        float total = km*miles;
        System.out.printf("The total miles is %d and total km is %d",total,miles);
    }
}
