public class Reserve {

    private Member member;
    private Book book;
    private int reserveDateDay;
    private int reserveDateMonth;
    private int reserveDateYear;

    public Reserve(
        Member member,
        Book book,
        int reserveDateDay,
        int reserveDateMonth,
        int reserveDateYear
    ) {
        this.member = member;
        this.book = book;
        this.reserveDateDay = reserveDateDay;
        this.reserveDateMonth = reserveDateMonth;
        this.reserveDateYear = reserveDateYear;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public int getReserveDateDay() {
        return borrowDateDay;
    }

    public int getReserveDateMonth() {
        return borrowDateMonth;
    }

    public int getReserveDateYear() {
        return borrowDateYear;
    }

    public void displayReserveInfo() {
        System.out.println("Borrow Information:");
        System.out.println("Member: " + member.getFullName());
        System.out.println("Book: " + book.getTitle());
        System.out.println(
            "Reserve Date: " + borrowDateDay + "/" + borrowDateMonth + "/" + borrowDateYear
        );
    }
}
