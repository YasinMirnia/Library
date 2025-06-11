public class Book {

    protected int bookCode;
    protected String title;
    protected String author;
    protected int publishYear;
    protected String publisher;
    protected int numberOfPages;
    protected String orginalLanguage;
    protected boolean isAvailable = true;

    protected static int totalBooks = 0;
    protected static int availableBooksForReserve = 0;
    protected static int availableBooksForBorrow = 0;
    protected static int reservedBooks = 0;
    protected static int borrowedBooks = 0;

    public static void printTotalBooks() {
        System.out.println("Total books are: " + totalBooks);
    }

    public static void printAvailableBooksForReserve() {
        System.out.println(
            "Total books that are available for reserve: " + availableBooksForReserve
        );
    }

    public static void printAvailableBooksForBorrow() {
        System.out.println("Total Books that are available for Borrow: " + availableBooksForBorrow);
    }

    public static void printReservedBooks() {
        System.out.println("Total Books that are Reserved: " + reservedBooks);
    }

    public static void printBorrowedBooks() {
        System.out.println("Total Books that are Borrowed: " + borrowedBooks);
    }

    public static void increaseBooks() {
        totalBooks++;
    }

    public static void increaseAvailableBooksForReserve() {
        availableBooksForReserve++;
    }

    public static void increaseAvailableBooksForBorrow() {
        availableBooksForBorrow++;
    }

    public static void increaseReservedBooks() {
        reservedBooks++;
    }

    public static void increaseBorrowedBooks() {
        borrowedBooks++;
    }

    public static int getAvailableBooksForReserve() {
        return availableBooksForReserve;
    }

    public static void decreaseBooks() {
        if (totalBooks > 0) totalBooks--;
    }

    public static void decreaseAvailableBooksForBorrow() {
        if (availableBooksForBorrow > 0) availableBooksForBorrow--;
    }

    public Book(
        int bookCode,
        String title,
        String author,
        int publishYear,
        String publisher,
        int numberOfPages,
        String orginalLanguage
    ) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.orginalLanguage = orginalLanguage;
        totalBooks++;
        availableBooksForReserve++;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setOrginalLanguage(String orginalLanguage) {
        this.orginalLanguage = orginalLanguage;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
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

    public Novel(
        int bookCode,
        String title,
        String author,
        int publishYear,
        String publisher,
        int numberOfPages,
        String orginalLanguage,
        String genere

    ) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.genere = genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("8.Novel's Genere:" + genere);
    }
}

class WorkBook extends Book {

    protected String subject;

    public WorkBook(
        int bookCode,
        String title,
        String author,
        int publishYear,
        String publisher,
        int numberOfPages,
        String orginalLanguage,
        String subject
    ) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("8.Work Book's Subject:" + subject);
    }
}

class TextBook extends Book {

    protected String jeldType;

    public TextBook(
        int bookCode,
        String title,
        String author,
        int publishYear,
        String publisher,
        int numberOfPages,
        String orginalLanguage,
        String jeldType
    ) {
        super(bookCode, title, author, publishYear, publisher, numberOfPages, orginalLanguage);
        this.jeldType = jeldType;
    }

    public void setJeldType(String jeldType) {
        this.jeldType = jeldType;
    }

    public String getJeldType() {
        return jeldType;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo();
        System.out.println("9.Text Book's Jeld Type:" + jeldType);
    }
}
