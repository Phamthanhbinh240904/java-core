package buoi6.Activity72.Activity71;

public class FulltimeEmployee extends Employee {
    private int baseSalary;
    private int level;
    private int overTimeDay;

    public FulltimeEmployee() {

    }

    public FulltimeEmployee(String name, String maNV, int baseSalary, int level, int overTimeDay) {
        super(name, maNV);
        this.level = level;
        this.overTimeDay = overTimeDay;

        this.level = level;
        if (this.level==2) {
            this.baseSalary = 20000000;
        }
        if(this.level==1){
            this.baseSalary = 10000000;
        }

        this.overTimeDay = overTimeDay;

    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }


    public void printInfo(){
        super.printInfo();
        System.out.println("luong can ban"+baseSalary);
        System.out.println("cap bac:"+level);
        System.out.println("so ngay lam them :"+overTimeDay);
    }

    public double getTotalSalary() {
        if(level==1){
            baseSalary=20000000;
        }else {
            baseSalary=10000000;
        }
        return baseSalary+overTimeDay*800000;

    }

    @Override
    public String toString() {
        String result;
        result = super.toString();
        return result+"FulltimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", level=" + level +
                ", overTimeDay=" + overTimeDay +"  tong luong: "+getTotalSalary()+
                '}';
    }
}
