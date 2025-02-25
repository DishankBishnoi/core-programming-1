package javaProgramming.level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNum = sc.nextFloat();
        float secondNum = sc.nextFloat();
        float addition = firstNum + secondNum;
        float subtraction = firstNum - secondNum;
        float multiplication = firstNum * secondNum;
        float division = firstNum / secondNum;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.0f and %.0f is :%.0f %.0f %.0f  and %.0f",firstNum,secondNum,addition,subtraction,multiplication,division);
    }
}
