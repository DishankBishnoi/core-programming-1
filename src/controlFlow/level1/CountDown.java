package controlFlow.level1;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number>=1){
            System.out.println(number);
            number--;

        }
    }
}
