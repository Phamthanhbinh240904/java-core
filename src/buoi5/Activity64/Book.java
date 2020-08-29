package buoi5.Activity64;

public class Book {
    private String name;
    private String author;
    private long price;
    private long totoSold;

    public Book() {
    }

    public Book(String name, String author, long price, long totoSold) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.totoSold = totoSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTotoSold() {
        return totoSold;
    }

    public void setTotoSold(long totoSold) {
        this.totoSold = totoSold;
    }

    public boolean ktBestSeller(){
        if(totoSold>1000){
            return true;

        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", totoSold=" + totoSold +
                '}'+"\n";
    }
}
