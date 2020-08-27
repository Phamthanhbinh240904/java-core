package buoi5.Activity63;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        StoreManagement storeManagement=new StoreManagement(n);
        Store store=new Store(n);

        System.out.println("dien thoai trong cua hang:"+storeManagement.toString());


    }
}
