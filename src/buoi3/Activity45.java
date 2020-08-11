package buoi3;

import java.util.Scanner;

public class Activity45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n:");
        int n=sc.nextInt();
        int giaithua=1;
        for(int i=1;i<=n;i++){
            giaithua*=i;
        }
        System.out.println(+n+"!="+giaithua);
    }
}
