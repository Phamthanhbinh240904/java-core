package buoi8;

public class FulltimeEmployee extends Employee implements EmployeeImpl {
        final long MEAL_ALLOWANCE=2000000;
        private int totalWorkingDays;
        private long dailySalary;

    public FulltimeEmployee(int totalWorkingDays, long dailySalary) {
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNunber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public long getMEAL_ALLOWANCE() {
        return MEAL_ALLOWANCE;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public double getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }


    @Override
    public String toString() {
        String result=super.toString();
        return "FulltimeEmployee{" +result +
                "MEAL_ALLOWANCE=" + MEAL_ALLOWANCE +
                ", totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                '}';
    }
}
