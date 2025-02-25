package controlFlow.level1;

import java.util.Scanner;

public class SumTillNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int number = sc.nextInt();
            if(number<=0){
                break;
            }
            sum+=number;
        }
        System.out.println(sum);
    }
}
