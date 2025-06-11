public class Borrow {

    private Member member;
    private Book book;

    public Borrow(
        Member member,
        Book book
    ) {
        this.member = member;
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public void displayBorrowInfo() {
        System.out.println("Borrow Information:");
        System.out.println("Member: " + member.getFullName());
        System.out.println("Book: " + book.getTitle());
    }

    protected class BorrowDate {
        protected int day;
        protected int month;
        protected int year;

        public BorrowDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String getFormattedDate() {
            return day + "/" + month + "/" + year;
        }
    }
}
