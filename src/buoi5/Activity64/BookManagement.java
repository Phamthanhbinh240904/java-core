package buoi5.Activity64;

import com.sun.javaws.IconUtil;

import java.util.Arrays;
import java.util.Scanner;

public class BookManagement {
    private int n;
    private Book[] books;

    public BookManagement(int n) {
        books=new Book[n];
        this.n = n;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("nhap ten sach");
            String name=sc.nextLine();

            System.out.println("nhap tac gia");
            String author=sc.nextLine();

            System.out.println("nhap gia sach:");
            long price=sc.nextLong();

            System.out.println("nhap tong so da ban duoc");
            long totalSold=sc.nextLong();
            sc.nextLine();

            books[i]=new Book(name,author,price,totalSold);
        }
    }

    public int demBestSeller(){
        int count=0;
        for(Book book : books){
            if(book.ktBestSeller()==true){
                count=count+1;
            }
        }
        return count;
    }

    public String totalSoldMax(){
        long a=0;
        int i=0;
        int index=0;
        for(Book book : books){
            if(a<book.getTotoSold()){
                a=book.getTotoSold();
                index=i;
            }
            i++;
        }
        return books[index].toString();
    }

    @Override
    public String toString() {
        return "BookManagement{" +
                "tong so sach:" + n +"\n"+
                ", book:\n" + Arrays.toString(books) +
                '}';
    }
}
