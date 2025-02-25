package javaProgramming.level1;

public class ProfitLoss {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        float profit = sp-cp;
        float profitpercent = (profit/cp)*100;
        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d\n",cp,sp);
        System.out.printf("The Profit is INR %.0f and the Profit Percentage is %.0f",profit,profitpercent);
    }
}
