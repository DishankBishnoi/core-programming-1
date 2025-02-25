package controlFlow.level1;

import java.util.Scanner;

public class VotingRights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18){
            System.out.printf("The person age is %d and can vote",n);
        }
        else if(n<18){
            System.out.printf("The person age is %d and cannot vote",n);
        }
    }
}
