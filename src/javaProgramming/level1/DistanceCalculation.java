package javaProgramming.level1;

import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        int distance = sc.nextInt();
        System.out.printf("Your Height in cm is %d while in feet is %d and inches is %d",distance*30,distance,distance*12);

    }
}
