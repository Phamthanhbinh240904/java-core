package buoi5.Activity63;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so cua hang :");
        int n=sc.nextInt();

        StoreManagement storeManagement=new StoreManagement(n);


        System.out.println("dien thoai trong cua hang:"+storeManagement.toString());

        System.out.println("cua hang ban dien thoai nhieu nhat  "+storeManagement.cuaHangBanNhieu());
        System.out.println("cua hang ban it dien thoai nhat   "+storeManagement.cuaHangBanIt());

        System.out.println("doanh thu lon nhat:"+storeManagement.doanhThuLonNhat());
        System.out.println("cau hang co doanh thu nho nhat:"+storeManagement.doanhThuNhoNhat());

        System.out.println("so dien thoai co Bluetoolth/5G/Wifi:"+storeManagement.tongDienThoai5G());
    }
}
