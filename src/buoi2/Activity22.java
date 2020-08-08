package buoi2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen:");
        int a=sc.nextInt();
        int b=3*a+2*a*10+a*100;
        System.out.println("bieu thuc can lam n+nn+nnn la:"+b);
    }

}