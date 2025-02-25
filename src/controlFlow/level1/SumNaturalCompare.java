package controlFlow.level1;

import java.util.Scanner;

public class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        int formula = number*(number+1)/2;
        while(number>0){
            sum+=number;
            number--;
        }

        System.out.println(sum);
        System.out.println(formula);
    }
}
