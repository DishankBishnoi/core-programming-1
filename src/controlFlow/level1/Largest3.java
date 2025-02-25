package controlFlow.level1;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        if(a>b && a>c){
            largest = a;
        }
        else if(b>a && b>c){
            largest = b;
        }
        else if(c>a && c>b){
            largest = c;
        }
        System.out.println(largest);

    }
}
