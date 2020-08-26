package buoi5.Activity63;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap thong tin cua hang:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            StoreManagement storeManagement=new StoreManagement(n);
            System.out.println("nhap so dien thoai co trong cua hang thu:"+(i+1));

            SmartPhone smartPhone=new SmartPhone();
            int m=sc.nextInt();
            Store store=new Store(m);
            System.out.println("thong tin cac cua hang vua nhap:\n"+storeManagement.toString()+"\n"+store.toString());
        }

    }
}
