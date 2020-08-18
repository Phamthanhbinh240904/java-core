package buoi5.Activity51;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int dai;
        int rong;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        dai = sc.nextInt();
        System.out.println("nhap chieu rong:");
        rong = sc.nextInt();
        Rectangle activity61 = new Rectangle(dai, rong);
        System.out.println("chu vi la:" + activity61.chuvi());
        System.out.println("dien tich la:" + activity61.dientich());
        activity61.toString();
        System.out.println("kiem tra :"+activity61.kt());
    }


}
