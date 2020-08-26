package suabai;
import java.util.Scanner;

public class Activity53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the 1st array: n = ");
        int n = scanner.nextInt();
        int[] a = new int[100];
        System.out.println("Enter elements of the 1st array: ");

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2nd array: n = ");
        int m = sc.nextInt();
        int[] b = new int[100];
        System.out.println("Enter  elements of the 2nd array: ");

        for (int i = 0; i < m; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Original array:");

        System.out.print("Length = " + n + "; " + "elements = ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.print("Length = " + m + "; " + "elements = ");

        for (int i = 0; i < m; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Merged array:");
        System.out.print("Length = " + (m + n) + "; elements = ");
        int[] c = new int[a.length + b.length];


        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            c[i + n] = b[i];
        }

        for (int i = 0; i < (m + n); i++) {
            System.out.print(c[i] + " ");
        }

    }
}