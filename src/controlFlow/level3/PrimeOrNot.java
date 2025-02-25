package controlFlow.level3;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        int i =2;
        while(number > i){
            if(number % i == 0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
            i++;

        }
        System.out.println(isPrime);
    }
}
