package controlFlow.level1;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Negative number");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else if(n>0){
            System.out.println("Positive number");
        }
    }
}
