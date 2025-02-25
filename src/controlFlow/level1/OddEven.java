package controlFlow.level1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=number;i>=1;i--){
            if(i%2==0){
                System.out.println("Odd");
            }
            else if(i%2!=0){
                System.out.println("Even");
            }
        }
    }
}
