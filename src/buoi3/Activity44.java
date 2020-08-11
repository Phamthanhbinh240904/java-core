package buoi3;

import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n:");
        int n=sc.nextInt();
        int tong=0;
        float tb=0;

      for(int i=1;i<=n;i++){
          tong=tong+i;

      }
      tb=(float)tong/n;
      System.out.println("tong la:"+tong);
        System.out.println("trung binh la:"+tb);

    }
}
