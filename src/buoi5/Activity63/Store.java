package buoi5.Activity63;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    private String name;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store() {
    }

    public Store(int n,String name, String address) {
        phones = new SmartPhone[n];
        this.n=n;
        this.name = name;
        this.address = address;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("nhap so luong dien thoai co trong cua hang thu:"+(i+1));
        int m=sc.nextInt();
        sc.nextLine();
            for (; i < m; i++) {

                System.out.println("nhap thuong hieu dien thoai:");
                String brand = sc.nextLine();
                System.out.println("Có Bluetooth hay ko ");
                boolean hasBluetooth = sc.nextBoolean();
                System.out.println("Có 5G hay ko");
                boolean has5G = sc.nextBoolean();
                System.out.println("co wifi ko");
                boolean hasWifi = sc.nextBoolean();
                sc.nextLine();
                System.out.println("he dieu hanh:");
                String os = sc.nextLine();
                System.out.println("bo nho");
                float memory = sc.nextFloat();
                System.out.println("mau");
                sc.nextLine();
                String color = sc.nextLine();
                System.out.println("gia ban");
                long price = sc.nextLong();
                System.out.println("tong so luong");
                int totalSold = sc.nextInt();
                sc.nextLine();
                phones[i] = new SmartPhone(brand, hasBluetooth, has5G, hasWifi, os, memory, color, price, totalSold);

            }



    }

    public void nhapSmartPhone(){

    }

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }


    public int tongSoLuongDTBanDuoc() {
        SmartPhone smartPhone = new SmartPhone();
        int counter = 0;
        for (int i = 0; i < smartPhone.getTotalSold(); i++) {
            counter++;
        }
        return counter;
    }



    public long tongDoanhThu() {
        long tong;
        SmartPhone smartPhone = new SmartPhone();
        tong = smartPhone.getTotalSold() * smartPhone.getPrice();
        return tong;
    }

    public int tongBlueToolth(){

        int count=0;

        for(SmartPhone smartPhone : phones){
            if(smartPhone.isHasBluetooth()==true||smartPhone.isHas5G()==true||smartPhone.isHasWifi()==true){
                count=count+1;

            }

        }
        return count;
    }

    @Override
    public String toString() {
        return "Store{" +
                "Tên cửa hàng='" + name + '\'' +
                ", Địa chỉ cửa hàng='" +address + '\'' +
                ", Tổng số điện thoại có trong của hàng=" + this.n +
                ", Mảng danh sách các điện thoại có trong cửa hàng=" + Arrays.toString(phones)+
                '}'+"\n";
    }
}
