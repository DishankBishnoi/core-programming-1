package javaProgramming.level2;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int q = sc.nextInt();
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d",n/q,q%n,n,q);
    }
}
