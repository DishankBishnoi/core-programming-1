package controlFlow.level1;

import java.util.Scanner;

public class SumNaturalCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();


        for (int i = number; i >0; i--) {
            sum += i;
        }
        int formula = number*(number+1)/2;
        System.out.println(formula);
        System.out.println(sum);

    }
}
