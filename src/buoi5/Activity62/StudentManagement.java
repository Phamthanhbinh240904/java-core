package buoi5.Activity62;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(int n) {
        students = new Student[n];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Nhap vao ten SV thu: " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Nhap vao GPA SV thu: " + (i+1));
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);
        }
    }

    public int countDo(){
        int counter =0;
        for(Student student : students){
            if(student.checDo() == true){
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int countTruot(){
        int counter =0;
        for(Student student : students){
            if(student.checDo() == false){
                counter = counter + 1;
            }
        }
        return counter;
    }




    public String diemCao() {
        float b=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(b<students[i].getGpa()){
                b=students[i].getGpa();
                index=i;
            }
        }
        return students[index].getName()+"\t"+students[index].getGpa();
    }

    public String diemThap() {
        float b=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(b>students[i].getGpa()){
                b=students[i].getGpa();
                index=i;
            }
        }
        return students[index].getName()+"\t"+students[index].getGpa();
    }




    /*@Override
    public void toString() {
        if(!diemCao()){
            return;
        }else{
            System.out.println( Arrays.toString(students));
        }


    }*/
}