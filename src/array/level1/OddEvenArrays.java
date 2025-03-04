import java.util.Scanner;
import java.util.ArrayList;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) even.add(i);
            else odd.add(i);
        }

        System.out.println("Odd Numbers: " + odd);
        System.out.println("Even Numbers: " + even);
        scanner.close();
    }
}
