public class Borrow {

    private Member member;
    private Book book;
    private int borrowDateDay;
    private int borrowDateMonth;
    private int borrowDateYear;

    public Borrow(
        Member member,
        Book book,
        int borrowDateDay,
        int borrowDateMonth,
        int borrowDateYear
    ) {
        this.member = member;
        this.book = book;
        this.borrowDateDay = borrowDateDay;
        this.borrowDateMonth = borrowDateMonth;
        this.borrowDateYear = borrowDateYear;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public int getBorrowDateDay() {
        return borrowDateDay;
    }

    public int getBorrowDateMonth() {
        return borrowDateMonth;
    }

    public int getBorrowDateYear() {
        return borrowDateYear;
    }

    public void displayBorrowInfo() {
        System.out.println("Borrow Information:");
        System.out.println("Member: " + member.getFullName());
        System.out.println("Book: " + book.getTitle());
        System.out.println(
            "Borrow Date: " + borrowDateDay + "/" + borrowDateMonth + "/" + borrowDateYear
        );
    }
}
