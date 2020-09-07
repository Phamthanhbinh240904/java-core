package buoi8;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap số nhân viên:");
        int n=sc.nextInt();
        EmployeeManagement employeeManagement=new EmployeeManagement(n);

        System.out.println("Danh sách nhân viên là \n"+employeeManagement.toString());
        System.out.println("nhân viên có lương cao nhất:"+employeeManagement.luongCao());
        System.out.println("nhân viên có lương thấp nhất:"+employeeManagement.luongThap());
    }
}
