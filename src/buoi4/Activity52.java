package buoi4;

import java.util.Scanner;

public class Activity52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap n:");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("nhap ca phan tu mang:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]="+a[i]+"\t");
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(a[i]==a[j]){
                    return;
                }
            }
        }
    }
}
