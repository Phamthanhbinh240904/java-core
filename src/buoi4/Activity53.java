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

        System.out.print("\nso luong phan tu thu nhat la:"+n);
        System.out.println("\nmang thu nhat la:");
        show(a);


        System.out.print("\nso luong phan tu thu 2 la:"+m);
        System.out.println("\nmang thu hai  la:");
        show(b);

        System.out.println("\ntong so luong mang:" + (n + m));
        System.out.println("tong mang la:");
        show(a);
        show(b);
    }

    public static void show(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
