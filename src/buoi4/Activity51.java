package buoi4;

import java.util.Scanner;

public class Activity51 {
    public static void main(String args[]) {
        int a, b, c, d;

        System.out.println("cac so Armstrong tu 1 den 500:");
        for (int j = 1; j < 501; j++) {
            a = j / 100;
            d = j / 10;
            b = d % 10;
            c = j % 10;

            if (j == (a * a * a + b * b * b + c * c * c)) {

                System.out.println(+j + " = (" + a + "*" + a + "*" + a + ") + (" + b + "*" + b + "*" + b + ") + (" + c + "*" + c + "*" + c + ")");
            }
        }


    }
}
