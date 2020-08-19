package buoi4;

import java.util.Scanner;

public class Activity52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n:");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("nhap ca phan tu mang:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        show(a);



    }
    public static void show(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"");
        }
    }
}
