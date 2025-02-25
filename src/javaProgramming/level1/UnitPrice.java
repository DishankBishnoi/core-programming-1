package javaProgramming.level1;

import java.util.Scanner;

public class UnitPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.0f if the quantity %d and unit price is INR %d",totalPrice,quantity,unitPrice);
    }
}
