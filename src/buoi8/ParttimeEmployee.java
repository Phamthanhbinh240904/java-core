package buoi8;

public class ParttimeEmployee extends Employee implements EmployeeImpl {
    final int MEAL_ALLOWANCE=0;
    //số ca làm việc
    private int totalWorkingShift;
    //lương theo ca làm việc
    private long baseSalary;

    public ParttimeEmployee(int totalWorkingShift, long baseSalary) {
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public ParttimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getMEAL_ALLOWANCE() {
        return MEAL_ALLOWANCE;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public double getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public String toString() {
        String result=super.toString();
        return "ParttimeEmployee{" +result+
                "MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
