package buoi2;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        int a=sc.nextInt();
        System.out.println("nhap b");
        int b=sc.nextInt();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        int thuong=a/b;
        int sodu=a%b;
        System.out.println("tong hai so la:"+tong);
        System.out.println("hieu 2 so la:"+hieu);
        System.out.println("tich hai so la:"+tich);
        System.out.println("thuong 2 so la:"+thuong);
        System.out.println("so du cua amod b:"+sodu);
    }
}
