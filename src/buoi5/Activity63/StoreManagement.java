package buoi5.Activity63;

import java.util.Arrays;
import java.util.Scanner;

public class StoreManagement {
    private int n;
    private Store[] stores;

    public StoreManagement() {
    }

    public StoreManagement(int n) {
        this.n=n;
        stores =new Store[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("nhap ten cua hang thu "+(i+1));
            String name=sc.nextLine();
            System.out.println("nhap dia chi cua hang "+(i+1));
            String address=sc.nextLine();
            stores[i]=new Store(n,name,address);

        }


    }
    public void nhapStore(){

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    public String cuaHangBanNhieu(){
        int a=0;
        int index=0;
        int i=0;
        for(Store store : stores){
            if(store.tongSoLuongDTBanDuoc()>a){
                a=store.tongSoLuongDTBanDuoc();
                index=i;
            }
            i++;
        }
        return stores[index].toString();
    }

    public String cuaHangBanIt(){
        int a=0;
        int index=0;
        int i=0;
        for(Store store : stores){
            if(store.tongSoLuongDTBanDuoc()<a){
                a=store.tongSoLuongDTBanDuoc();
                index=i;
            }
            i++;
        }
        return stores[index].toString();
    }


    public String doanhThuLonNhat(){
        long a=0;
        int index=0;
        int i=0;
        for(Store store : stores){
            if(store.tongDoanhThu()>a){
                a=store.tongDoanhThu();
                index=i;
            }
            i++;
        }
        return stores[index].toString();
    }

    public String doanhThuNhoNhat(){
        long a=0;
        int index=0;
        int i=0;
        for(Store store : stores){
            if(store.tongDoanhThu()<a){
                a=store.tongDoanhThu();
                index=i;
            }
            i++;
        }
        return stores[index].toString();
    }

    public int tongDienThoai5G(){
        int count=0;
        for(Store store : stores){
            if(store.tongBlueToolth()==1){
                count=count+1;
            }
        }
        return count;
    }


    @Override
    public String toString() {
        return "quan ly cua hang\n" +
                "Tổng số cửa hàng cần quản lý:" + this.n +
                "\n Danh sách các cửa hàng\n" + Arrays.toString(stores) +
                '}'+"\n";
    }



 
}
