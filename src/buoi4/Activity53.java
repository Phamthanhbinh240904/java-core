package buoi4;

import java.util.Scanner;

public class Activity53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap so luong mang thu nhat:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("nhap phantu mang:");

        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        System.out.println("mang thu nhap la:");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]="+a[i]+"\t");
        }

        System.out.println("nhap so luong mang thu hai:");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("nhap phantu mang:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("mang thu hai  la:");
        for(int i=0;i<m;i++){
            System.out.print("b["+i+"]="+b[i]+"\t");
        }
        System.out.println("tong so luong mang:"+(n+m));
        System.out.println("tong mang la:");
        for(int i=0;i<n;i++){
            System.out.print(+a[i]+"\t");

        }
        for(int i=0;i<m;i++){

            System.out.print(+b[i]+"\t");
        }
    }
}
