package buoi4;

import java.util.Scanner;

public class Activity53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so luong mang thu nhat:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap phan tu mang thu 1:");

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }


        System.out.println("\nnhap so luong mang thu hai:");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("nhap phan tu mang 2:");
        for (int i = 0; i < m; i++) {
            System.out.print("b[" + i + "]=");
            b[i] = sc.nextInt();
        }

        System.out.print("\nso luong phan tu thu nhat la:");
        System.out.println("\nmang thu nhat la:");
        for (int i = 0; i < n; i++) {
            System.out.print(+ a[i] + "\t");
        }

        System.out.print("so luong phan tu thu 2 la:");

        System.out.println("\nmang thu hai  la:");
        for (int i = 0; i < m; i++) {
            System.out.print(+ b[i] + "\t");
        }
        System.out.println("\ntong so luong mang:" + (n + m));
        System.out.println("tong mang la:");
        for (int i = 0; i < n; i++) {
            System.out.print(+a[i] + "\t");

        }
        for (int i = 0; i < m; i++) {

            System.out.print(+b[i] + "\t");
        }
    }
}
