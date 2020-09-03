package buoi6.Activity72.Activity71;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("nhap so nhan vien :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EmployeeManagement employeeManagement = new EmployeeManagement(n);

        for(int i=0;i<n;i++){
            System.out.println("1 : nhan vien fulltime");
            System.out.println("2 : nhan vien parttime");
            int m=sc.nextInt();
            switch (m){
                case 1:
                    employeeManagement.nhapnvFullTime();
                    break;
                case 2:
                    employeeManagement.nhapnvPartTime();
                    break;
            }
        }

        System.out.println("cac nhan vien trong cong ty : %.12f\n" + employeeManagement.toString());


        }
    }

