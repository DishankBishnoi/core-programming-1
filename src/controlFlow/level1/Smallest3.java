package controlFlow.level1;

import java.util.Scanner;

public class Smallest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        if(a<b && a<c){
            smallest = a;
        }
        else if(b<a && b<c){
            smallest = b;
        }
        else if(c<b && c<a){
            smallest = c;
        }
        System.out.println(smallest);
    }
}
