package buoi6.Activity71;

public class ParttimeEmployee extends Employee {
    private int workHourNumber;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String name, String maNV, int workHourNumber) {
        super(name, maNV);
        this.workHourNumber = workHourNumber;
    }


    public double getTotalSalary() {
        return 100000*workHourNumber;
    }


    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("nhap so gio lam viec:"+workHourNumber);
    }

    @Override
    public String toString() {
        String result;
        result = super.toString();
        return result +
                "workHourNumber=" + workHourNumber + "tong luong"+getTotalSalary()+
                '}';
    }
}
