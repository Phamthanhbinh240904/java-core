package buoi6.Activity71;

public class FulltimeEmployee extends Employee {
    private long baseSalary;
    private String level;
    private int overTimeDay;

    public FulltimeEmployee() {

    }

    public FulltimeEmployee(String name, String maNV, long baseSalary, String level, int overTimeDay) {
        super(name, maNV);
        this.baseSalary = baseSalary;
        this.level = level;
        this.overTimeDay = overTimeDay;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }
}
