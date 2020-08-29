package buoi5.Activity64;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("nhap so sach trong shop:");
            int n=sc.nextInt();
            BookManagement bookManagement=new BookManagement(n);
            System.out.println("sach da nhap tu he thong:"+bookManagement.toString());
            System.out.println("tong so sach Best Seller:"+bookManagement.demBestSeller());
            System.out.println("sach ban chay nhat:"+bookManagement.totalSoldMax());


    }
}
