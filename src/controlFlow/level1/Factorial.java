package controlFlow.level1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        while(n>1){
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
