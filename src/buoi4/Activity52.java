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
        System.out.println("mang trung la:");
        show(a);


    }

    public static void show(int a[]) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
/*
            for(int j=i+1;j<a.length;j++){
                if(a[j]==a[i]){
                    b=a[j];
                    System.out.println(b);
                }

            }
*/
           for(int j=1;j<a.length;j++){
               if(a[j]!=a[i]){
                   b=a[j];
               }
           }
            System.out.println(b);


        }


    }
}
