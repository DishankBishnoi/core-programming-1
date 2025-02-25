package array.level1;

import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                System.out.println("Positive");
            }
            else if (arr[i] < 0) {
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }


    }
}
