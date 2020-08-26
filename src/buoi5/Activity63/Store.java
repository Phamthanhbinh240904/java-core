package buoi5.Activity63;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    private String name;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store(int n) {
        phones = new SmartPhone[n];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thuong hieu dien thoai:");
            String brand = sc.nextLine();
            System.out.println("Có Bluetooth hay ko ");
            boolean hasBluetooth = sc.hasNext();
            System.out.println("Có 5G hay ko");
            boolean has5G = sc.hasNext();
            System.out.println("co wifi ko");
            boolean hasWifi = sc.hasNext();
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
            System.out.println("tnog so luong");
            int totalSold = sc.nextInt();
            phones[i] = new SmartPhone(brand, hasBluetooth, has5G, hasWifi, os, memory, color, price, totalSold);
        }

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

    @Override
    public String toString() {
        return "Store{" +
                "Tên cửa hàng='" + name + '\'' +
                ", Địa chỉ cửa hàng='" + address + '\'' +
                ", Tổng số điện thoại có trong của hàng=" + n +
                ", Mảng danh sách các điện thoại có trong cửa hàng=" + Arrays.toString(phones) +
                '}';
    }
}
