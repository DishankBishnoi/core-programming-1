package controlFlow.level1;

import java.util.Scanner;

public class PerformanceBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary:");
        int salary = sc.nextInt();
        System.out.print("Enter the years of service:");
        int service = sc.nextInt();
        int bonus = 0;
        if(service>=5){
            bonus = salary*5/100;

        }
        System.out.println("The bonus is "+bonus);

    }
}
