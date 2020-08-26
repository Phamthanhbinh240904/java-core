package buoi5.Activity62;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap vao so SV: ");
           int n = scanner.nextInt();

           StudentManagement studentManagement = new StudentManagement(n);

           System.out.println("Tong so sinh vien DO: " + studentManagement.countDo());
           System.out.println("Tong so sinh vien TRUOT: " + studentManagement.countTruot());

        System.out.println("sv co diem cao nhat la:"+studentManagement.diemCao());
        System.out.println("sv co diem thap nhat la:"+studentManagement.diemThap());



    }
}
