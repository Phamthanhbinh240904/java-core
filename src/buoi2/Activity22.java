package buoi2;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguyen:");
        int a=sc.nextInt();
        int b=3*a+2*a*10+a*100;
        int c=10*a+a;
        int d=100*a+c;
        System.out.println(+a+"+"+c+"+"+"+" +d +"="+b);
    }

}