package javaProgramming.level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int combinations = students *(students-1)/2;
        System.out.println("The number of possible handshakes is " + combinations);
    }
}
