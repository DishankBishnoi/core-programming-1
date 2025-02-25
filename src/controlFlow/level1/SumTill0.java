package controlFlow.level1;

import java.util.Scanner;

public class SumTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        while(true){
            double number = sc.nextInt();
            if(number==0){
                break;
            }
            sum+=number;
        }
        System.out.println(sum);
    }
}
