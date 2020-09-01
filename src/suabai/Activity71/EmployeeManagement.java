package suabai.Activity71;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Scanner scanner = new Scanner(System.in);


        for(int i=0; i< 10; i++){
            int option  = scanner.nextInt();
            if(option == 1){
                employees[i] = new FulltimeEmployee(1 ,"aba", 23, true, 10.4);
            }
            if(option == 2){
                employees[i] = new ParttimeEmployee(1, "asf", 21, 10.0);
            }
        }


        for(Employee employee : employees){
            /*if(employee instanceof FulltimeEmployee){
                FulltimeEmployee fulltime = (FulltimeEmployee) employee;
            }
            if(employee instanceof ParttimeEmployee){
                ParttimeEmployee parttime = (ParttimeEmployee) employee;
            }*/

            employee.getTotalSalary();
        }
    }
}