package array.level1;

import java.util.Scanner;

public class MeanHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        System.out.println("Enter the height of the player");
        double mean= 0;
        for (int i = 0; i < 10; i++) {
            height[i] = sc.nextInt();
            mean += height[i];
        }
        System.out.println("The mean height is " + mean/11);

    }
}
