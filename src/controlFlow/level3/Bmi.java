package controlFlow.level3;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  weight = sc.nextInt();
        double height = sc.nextInt();
        double bmi = weight / (height * height);
        System.out.println(bmi*10000);
    }
}
