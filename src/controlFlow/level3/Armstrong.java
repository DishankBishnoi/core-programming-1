package controlFlow.level3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while (original != 0) {
            int mod = original % 10;
            int power = (int)Math.pow(mod,3);
            sum += power;
            original = original / 10;

        }
        if (number == sum) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
