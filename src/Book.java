public class Book {
    private int numOfPages;
    private String author;
    private String title;
    private int price;

    public Book(String author, String title, int price, int numOfPages) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.numOfPages = numOfPages;
    }
    public void addOnePage() {
        numOfPages++;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public int getPrice (){
        return price;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Book Book1 = new Book("J.K Rowling","Harry Potter",75,361);
        Book1.setPrice(100);
        Book1.addOnePage();
        System.out.println(Book1.title + "," + Book1.author);
    }
}
