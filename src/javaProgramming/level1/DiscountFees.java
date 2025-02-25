package javaProgramming.level1;

import java.util.Scanner;

public class DiscountFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fees: ");
        int fees = sc.nextInt();
        System.out.print("Discount: ");
        int discount = sc.nextInt();
        int discountPrice = fees*discount/100;
        int finalFees = fees-discountPrice;
        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",discountPrice,finalFees);

    }
}
