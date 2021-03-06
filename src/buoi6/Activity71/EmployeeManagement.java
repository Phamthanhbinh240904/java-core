package buoi6.Activity71;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;
    Scanner sc=new Scanner(System.in);

    public EmployeeManagement(int n) {
        employees=new Employee[n];
        this.n = n;

        for(int i=0;i<n;i++){
            for(int j=0; i< n; i++){
                System.out.println("chon 1: nhan vien fulltime");
                System.out.println("chon 2: nhan vien parttime");
                int option  = sc.nextInt();
                sc.nextLine();
                if(option == 1){
                    int baseSalary=0;
                    System.out.println("nhap ten nhan vien:");
                    String name=sc.nextLine();

                    System.out.println("nhap ma nhan vien :");
                    String maNV=sc.nextLine();

                    System.out.println("sep : 1");
                    System.out.println("nhan vien : 2");
                    System.out.println("chon cap bac:");
                    int level=sc.nextInt();

                    if(level==1){
                        baseSalary=20000000;
                    }

                    if(level==2){
                        baseSalary=10000000;
                    }
                    System.out.println("so ngay lam them:");
                    int overTimeDay=sc.nextInt();
                    sc.nextLine();
                    employees[i] = new FulltimeEmployee(name,maNV,baseSalary,level,overTimeDay);


                }
                if(option == 2){
                    System.out.println("nhap ten nhan vien:");
                    String name=sc.nextLine();
                    System.out.println("nhap ma nhan vien :");
                    String maNV=sc.nextLine();
                    System.out.println("nhap so gio lam viec:");
                    int workHourNumber=sc.nextInt();
                    employees[i] = new ParttimeEmployee(name,maNV,workHourNumber);
                }
            }

        }
    }


    @Override
    public String toString() {


        return "EmployeeManagement{" +

                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
