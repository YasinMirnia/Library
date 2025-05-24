public class Book {
    protected int bookCode;
    protected String title;
    protected String author;
    protected int publishYear;
    protected String publisher;
    protected int numberOfPages;
    protected String orginalLanguage;

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
        System.out.println("1.Book's Code:" + bookCode);
        System.out.println("2.Book's Title:" + title);
        System.out.println("3.Book's Author:" + author);
        System.out.println("4.Book's Publish Year:" + publishYear);
        System.out.println("5.Book's Publisher:" + publisher);
        System.out.println("6.Book's Number of Pages:" + numberOfPages);
        System.out.println("7.Book's Orginal Language:" + orginalLanguage);
    }
}

class Novel extends Book {
    protected String genere;
    public Book(int bookCode, String title, String author, int publishYear, String publisher,
    int numberOfPages, String orginalLanguage, String genere) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.genere = genere;
    }
}

class WorkBook extends Book {
    protected String subject;
    public Book(int bookCode, String title, String author, int publishYear, String publisher,
    int numberOfPages, String orginalLanguage, String subject) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.subject = subject;
}

class TextBook extends Book {
    protected String jeldType;
    public Book(int bookCode, String title, String author, int publishYear, String publisher,
    int numberOfPages, String orginalLanguage, String jeldType) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.jeldType = jeldType;
}