package controlFlow.level1;

import java.util.Scanner;

public class OddEvenFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
