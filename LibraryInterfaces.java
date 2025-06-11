import java.util.List;

public interface LibraryInterfaces {
    void borrowBook(int bookCode, int memberId) throws Exception;
    void returnBook(int bookCode, int memberId) throws Exception;
    void reserveBook(int bookCode, int memberId) throws Exception;
    void cancelReservation(int bookCode, int memberId) throws Exception;
}

public class LibraryManager implements LibraryInterfaces {

    protected List<Book> books;
    protected List<Member> members;

    public LibraryManager(List<Book> books, List<Member> members) {
        this.books = books;
        this.members = members;
    }

    @Override
    public void borrowBook(int bookCode, int memberId) throws Exception {
        Book book = findBookByCode(bookCode);
        Member member = findMemberById(memberId);

        if (!book.isAvailable()) {
            throw new Exception("Book is not available for borrow.");
        }
        if (member.getMemberBorrowedBooks() >= 3) {
            throw new Exception("Member reached maximum borrow limit.");
        }

        book.setAvailable(false);
        member.increaseBorrowedBooks();

        System.out.println("Book borrowed successfully.");
    }

    @Override
    public void returnBook(int bookCode, int memberId) throws Exception {
        Book book = findBookByCode(bookCode);
        Member member = findMemberById(memberId);

        book.setAvailable(true);
        member.decreaseBorrowedBooks();

        System.out.println("Book returned successfully.");
    }

    @Override
    public void reserveBook(int bookCode, int memberId) throws Exception {
        Book book = findBookByCode(bookCode);
        Member member = findMemberById(memberId);

        if (!book.isAvailableForReserve()) {
            throw new Exception("Book is not available for reserve.");
        }
        if (member.getReservedBooks() >= 3) {
            throw new Exception("Member reached maximum reserve limit.");
        }

        member.increaseReservedBooks();

        System.out.println("Book reserved successfully.");
    }

    @Override
    public void cancelReservation(int bookCode, int memberId) throws Exception {
        Book book = findBookByCode(bookCode);
        Member member = findMemberById(memberId);

        member.decreaseReservedBooks();

        System.out.println("Reservation canceled successfully.");
    }

    protected Book findBookByCode(int code) throws Exception {
        for (Book foundBook : books) {
            if (foundBook.getBookCode() == code) return foundBook;
        }
        throw new Exception("Book not found.");
    }

    protected Member findMemberById(int id) throws Exception {
        for (Member foundMember : members) {
            if (foundMember.getStudentId() == id) return foundBook;
        }
        throw new Exception("Member not found.");
    }
}