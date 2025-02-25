package controlFlow.level2;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hcf = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);




    }
}
