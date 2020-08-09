package buoi3;

import java.util.Scanner;

public class Activity42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong can tim:");
        int n=sc.nextInt();

        for(int i = 1; i <=n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int j=1;j<(2*i);j++){
                System.out.print("*");
            }



            System.out.println("\n");

        }

    }
}