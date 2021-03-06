package buoi5.Activity62;

public class Student {
    private String name;
    private float gpa;

    public Student() {
    }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean checDo(){
        if(gpa >=1.5f){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}