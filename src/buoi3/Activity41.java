package buoi3;

import java.util.Scanner;

public class Activity41 {

    public static void main(String[] args) {
        System.out.println("nhap fibonacci can lam: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print(fibonacci(i) + " ");

        }
    }


    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
