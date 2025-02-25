package javaProgramming.level1;

public class Discount {
    public static void main(String[] args) {
        int fees = 125000;
        int discount = 10;
        int total = fees*discount/100;
        int remaining = fees-total;

        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",remaining,total);
    }
}
