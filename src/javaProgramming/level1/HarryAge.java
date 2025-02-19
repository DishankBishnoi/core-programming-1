package javaProgramming.level1;

import java.util.Scanner;

public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current Year: ");
        int year =sc.nextInt();
        System.out.println("Harry Age is "+(year-2000));
    }
}
