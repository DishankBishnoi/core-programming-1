package javaProgramming.level1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base");
        float base = sc.nextFloat();
        System.out.println("Enter the height");
        float height = sc.nextFloat();
        float area = 0.5f*base*height;
        System.out.printf("Your Height in cm is %.0f while in feet is %.0f and inches is %.0f ",area,6.45*area,area*0.3);
    }
}
