package controlFlow.level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans  = n;
        int sum =0;
        while(ans!=0){
            int mod = ans % 10;
            sum = sum + mod;
            ans = ans / 10;
        }
        if(ans%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}
