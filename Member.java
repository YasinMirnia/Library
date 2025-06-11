public class Member {

    protected String fullName;
    protected int studentId;
    protected String faculty;
    protected String field;
    protected int entranceYear;
    protected int membershipDateDay;
    protected int membershipDateMonth;
    protected int membershipDateYear;
    protected int borrowedBooks = 0;
    protected int reserveBooks = 0;

    public void decreaseMemberBorrowedBooks() {
        borrowedBooks--;
    }

    public void decreaseReservedBooks() {
        reserveBooks--;
    }

    public int getMemberBorrowedBooks() {
        return borrowedBooks;
    }

    public int getReservedBooks() {
        return reserveBooks;
    }

    public void increaseBorrowedBooks() {
        if (borrowedBooks < 3) borrowedBooks++;
    }

    public void increaseReservedBooks() {
        if (reserveBooks < 3) reserveBooks++;
    }

    protected static int totalMembers = 0;

    public static void increaseTotalMembers() {
        totalMembers++;
    }

    public static void decreaseTotalMembers() {
        totalMembers--;
    }

    public static void printTotalMembers() {
        System.out.println("Members are: " + totalMembers);
    }

    public Member(
        String fullName,
        int studentId,
        String faculty,
        String field,
        int entranceYear,
        int membershipDateDay,
        int membershipDateMonth,
        int membershipDateYear
    ) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.field = field;
        this.entranceYear = entranceYear;
        this.membershipDateDay = membershipDateDay;
        this.membershipDateMonth = membershipDateMonth;
        this.membershipDateYear = membershipDateYear;
        increaseTotalMembers();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setEntranceYear(int entranceYear) {
        this.entranceYear = entranceYear;
    }

    public void setMembershipDateDay(int membershipDateDay) {
        this.membershipDateDay = membershipDateDay;
    }

    public void setMembershipDateMonth(int membershipDateMonth) {
        this.membershipDateMonth = membershipDateMonth;
    }

    public void setMembershipDateYear(int membershipDateYear) {
        this.membershipDateYear = membershipDateYear;
    }

    public String getFullName() {
        return fullName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getField() {
        return field;
    }

    public int getEntranceYear() {
        return entranceYear;
    }

    public int getMembershipDateDay() {
        return membershipDateDay;
    }

    public int getMembershipDateMonth() {
        return membershipDateMonth;
    }

    public int getMembershipDateYear() {
        return membershipDateYear;
    }

    public void displayMemberInfo() {
        System.out.println("1.Full Name: " + fullName);
        System.out.println("2.Student ID: " + studentId);
        System.out.println("3.Faculty: " + faculty);
        System.out.println("4.Field: " + field);
        System.out.println("5.Entrance Year: " + entranceYear);
        System.out.println(
            "6.Member Since: " +
            membershipDateDay +
            "/" +
            membershipDateMonth +
            "/" +
            membershipDateYear
        );
    }
}

class AssociateStudent extends Member {
    
    public AssociateStudent(
        String fullName,
        int studentId,
        String faculty,
        String field,
        int entranceYear,
        int membershipDateDay,
        int membershipDateMonth,
        int membershipDateYear
    ) {
        super(fullName, studentId , faculty , field, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
    }

    @Override
    public void displayMemberInfo() {
        super.displayMemberInfo();
    }
    
}

class UndergraduateStudent extends Member {

    public UndergraduateStudent(
        String fullName,
        int studentId,
        String faculty,
        String field,
        int entranceYear,
        int membershipDateDay,
        int membershipDateMonth,
        int membershipDateYear
    ) {
        super(fullName, studentId , faculty , field, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
    }

    @Override
    public void displayMemberInfo() {
        super.displayMemberInfo();
    }
}

class GraduateStudent extends Member {

    protected int graduationYear;

    public GraduateStudent(
        String fullName,
        int studentId,
        String faculty,
        String field,
        int entranceYear,
        int membershipDateDay,
        int membershipDateMonth,
        int membershipDateYear,
        int graduationYear
    ) {
        super(fullName, studentId, faculty, field, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.graduationYear = graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    @Override
    public void displayMemberInfo() {
        super.displayMemberInfo();
        System.out.println("7.Graduation Year: " + graduationYear);
    }
}
