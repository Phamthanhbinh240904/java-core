package buoi3;

import java.util.Scanner;

public class Activity46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so can chuyen doi sang nhi phan:");
        int n=sc.nextInt();
        int nhiphan = thapsangnhi(n);
        System.out.printf("so chuyen tu "+n+" sang nhi phan la:"+ nhiphan);
    }
    public static int thapsangnhi(int n)
    {
        int sonhiphan = 0;
        int p, i = 1;
        while (n>0)
        {
            p = n % 2;
            n /= 2;
            sonhiphan += p * i;
            i *= 10;
        }
        return sonhiphan;
    }
}

