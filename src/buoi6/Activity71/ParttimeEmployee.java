package buoi6.Activity71;

public class ParttimeEmployee extends Employee {
    private int workHourNumber;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String name, String maNV, int workHourNumber) {
        super(name, maNV);
        this.workHourNumber = workHourNumber;
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }
}
