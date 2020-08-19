package buoi4;

import java.util.Scanner;

public class Activity54 {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        show(arr);
    }

    /**
     * in các phần tử của mảng ra màn hình
     *
     * @param arr: mảng các số nguyên
     * @param n: số phần tử của mảng
     */
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}