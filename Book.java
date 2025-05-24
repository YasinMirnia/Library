public class Book {
    private int bookCode;
    private String title;
    private String author;
    private int publishYear;
    private String publisher;
    private int numberOfPages;
    private String orginalLanguage;

    public Book(int bookCode, String title, String author, int publishYear, String publisher,
    int numberOfPages, String orginalLanguage) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.orginalLanguage = orginalLanguage;
    }

    public void setBookCode(int bookCode){
        this.bookCode = bookCode;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setOrginalLanguage(String orginalLanguage){
        this.orginalLanguage = orginalLanguage;
    }

    public int getBookCode() {
        return bookCode;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getOrginalLanguage() {
        return orginalLanguage;
    }

    public void displayBookInfo() {
        System.out.println("Book's Code:" + bookCode);
        System.out.println("Book's Title:" + title);
        System.out.println("Book's Author:" + author);
        System.out.println("Book's Publish Year:" + publishYear);
        System.out.println("Book's Publisher:" + publisher);
        System.out.println("Book's Number of Pages:" + numberOfPages);
        System.out.println("Book's Orginal Language:" + orginalLanguage);
    }
}