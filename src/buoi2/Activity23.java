package buoi2;
import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so can tinh cuu chuong:");
        int a=sc.nextInt();
        int c=a;
        for(int i=1;i<11;i++) {
            c=a*i;
            System.out.println("cuu chuong la:"+a+"x"+i+"="+c);
        }

    }

}
