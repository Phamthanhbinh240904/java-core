package buoi5.Activity63;

import java.util.Arrays;
import java.util.Scanner;

public class StoreManagement {
    private int n;
    private Store[] stores;

    public StoreManagement(int n) {
        stores =new Store[n];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("nhap ten cua hang:");
            String name=sc.nextLine();
            System.out.println("nhap dia chi cua hang:");
            String address=sc.nextLine();
            stores[i]=new Store(name,address);
        }
    }

    @Override
    public String toString() {
        return "quan ly cua hang\n" +
                "Tổng số cửa hàng cần quản lý\n" + n +
                ", Danh sách các cửa hàng\n" + Arrays.toString(stores) +
                '}';
    }

 
}
