package controlFlow.level1;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0){
            System.out.printf(" Is the number %d divisible by 5? Yes",n);
        }
    }
}
