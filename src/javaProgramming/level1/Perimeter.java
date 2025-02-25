package javaProgramming.level1;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int perimeter = side*4;
        System.out.printf( "The length of the side is %d whose perimeter is %d",side,perimeter );
    }
}
