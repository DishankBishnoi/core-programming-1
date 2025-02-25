package array.level1;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println("Invalid");
            }
            else if(arr[i]>=18){
                System.out.println("Can Vote");
            }

            else{
                System.out.println("Cannot Vote");
            }
        }

    }
}
