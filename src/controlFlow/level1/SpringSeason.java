package controlFlow.level1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();
        if(month>=3 && month<=4){
            if(date>=20){
                System.out.println("Spring");
            }

        }
        else {
            System.out.println("Not Spring");
        }
    }
}
