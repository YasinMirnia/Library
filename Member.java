public class Member {
    private String fullName;
    private int studentId;
    private String faculty;
    private String field;
    private int entranceYear;
    private int membershipDateDay;
    private int membershipDateMonth;
    private int membershipDateYear;

    public Member(String fullName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.field = field;
        this.entranceYear = entranceYear;
        this.membershipDateDay = membershipDateDay;
        this.membershipDateMonth = membershipDateMonth;
        this.membershipDateYear = membershipDateYear;
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

    public void displayMemberInfo(){
        System.out.println("1.Full Name: " + fullName);
        System.out.println("2.Student Id: " + studentId);
        System.out.println("3.Faculty: " + faculty);
        System.out.println("4.Field: " + field);
        System.out.println("5.Entrance Year: " + entranceYear);
        System.out.println("6.Member Since: " + membershipDateDay + "/" + membershipDateMonth + "/" + membershipDateYear);
    }
}