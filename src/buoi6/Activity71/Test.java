package buoi6.Activity71;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("nhap so nhan vien :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        EmployeeManagement employeeManagement=new EmployeeManagement(n);
        System.out.println("cac nhan vien trong cong ty\n"+employeeManagement.toString());

    }
}
