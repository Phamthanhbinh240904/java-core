package buoi6.Activity71;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private int m;
    private Employee[] employees;
    private FulltimeEmployee[] fulltimeEmployees;
    private ParttimeEmployee[] parttimeEmployees;

    public EmployeeManagement(int n) {
        fulltimeEmployees=new FulltimeEmployee[n];
        parttimeEmployees=new ParttimeEmployee[n];

        this.n = n;
        Scanner sc=new Scanner(System.in);
        String a="^[a-z][a-z]*[a-z]$";
        for(int i=0;i<n;i++){
            System.out.println("nhap ten nhan vien:");
            String name=sc.nextLine();
            System.out.println("nhap ma nhan vien:");
            String maNV=sc.nextLine();
           if(maNV==a){

                System.out.println("nhap luong can ban:");
                long baseSalary=sc.nextLong();
                sc.nextLine();
                System.out.println("nhap cap bac:");
                String level=sc.nextLine();
                System.out.println("so ngay lam them:");
                int overTimeDay=sc.nextInt();
                sc.nextLine();
                fulltimeEmployees[i]=new FulltimeEmployee(name, maNV, baseSalary, level, overTimeDay);
            }else {
                System.out.println("nhap so gio lam viec:");
                int worlHourNumber = sc.nextInt();
                sc.nextLine();
                parttimeEmployees[i]=new ParttimeEmployee(name, maNV, worlHourNumber);
            }

        }


    }


}
