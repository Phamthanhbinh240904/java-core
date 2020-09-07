package buoi8;

public class Employee implements EmployeeImpl {
    private String name;
    private int age;
    private String identificationNunber;


    public Employee() {
    }

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }


    @Override
    public long getMealAllowance() {
        return 0;
    }

    @Override
    public double getSalaryRate() {
        return 0;
    }

    @Override
    public int getWorkingCount() {
        return 0;
    }

    public long calculateSalary() {
        return 0;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", identificationNunber='" + identificationNunber + '\'' +
                '}';
    }
}
