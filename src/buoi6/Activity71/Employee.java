package buoi6.Activity71;

public class Employee {
    private String name;
    private String maNV;

    public Employee() {

    }

    public Employee(String name, String maNV) {
        this.name = name;
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void printInfo(){
        System.out.println("nhap ten nhan vien:"+name);
        System.out.println("nhap ma sinh vien:"+maNV);

    }
}
