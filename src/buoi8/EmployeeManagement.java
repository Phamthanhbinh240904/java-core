package buoi8;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;
    Scanner sc=new Scanner(System.in);

    public EmployeeManagement(int n) {
        this.n = n;
        employees=new Employee[n];
        int option;
        for(int i=0;i<n;i++){
            System.out.println("1:nhan vien fulltime:");
            System.out.println("2:nhap vien parttime:");
            option=sc.nextInt();
            sc.nextLine();
            if(option==1){
                System.out.println("nhap ten nhan vien:");
                String name=sc.nextLine();
                System.out.println("nhap tuoi:");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("nhap so chung minh thư");
                String identificationNunber=sc.nextLine();
                System.out.println("nhap so ngay lam viec:");
                int totalWorkingDays=sc.nextInt();
                System.out.println("nhap lương theo ngày:");
                long dailySalary=sc.nextLong();
                sc.nextLine();
                employees[i]=new FulltimeEmployee(name, age, identificationNunber, totalWorkingDays, dailySalary);
            }else {
                System.out.println("nhap ten nhan vien:");
                String name=sc.nextLine();
                System.out.println("nhap tuoi:");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("nhap so chung minh thư");
                String identificationNunber=sc.nextLine();
                System.out.println("nhap so ca lam viec:");
                int totalWorkingShift=sc.nextInt();
                System.out.println("lương theo ca làm việc:");
                long baseSalary=sc.nextLong();
                sc.nextLine();
                employees[i]=new ParttimeEmployee(name, age, identificationNunber, totalWorkingShift, baseSalary);
            }
        }
    }

    public String luongCao(){
        double a=0;
        int i=0,index=0;
        for(Employee employee: employees){
            if(a<employee.getSalaryRate()){
                a=employee.getSalaryRate();
                index=i;
            }
            i++;
        }
        return employees[index].toString();
    }

    public String luongThap(){
        double a=100000000;
        int i=0,index=0;
        for(Employee employee: employees){
            if(a>employee.getSalaryRate()){
                a=employee.getSalaryRate();
                index=i;
            }
            i++;
        }
        return employees[index].toString();
    }


    @Override
    public String toString() {
        return "EmployeeManagement{" +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
