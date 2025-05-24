public class Member {
    protected String fullName;
    protected int studentId;
    protected String faculty;
    protected String field;
    protected int entranceYear;
    protected int membershipDateDay;
    protected int membershipDateMonth;
    protected int membershipDateYear;

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

class Professor extends Member {
    protected int teachingCode;
    protected String lesson;
    protected int experiences;
    public Professor(String fullName, int teachingCode, String faculty, String lesson, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear, int experiences) {
        super(fullName, faculty, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.teachingCode = teachingCode;
        this.lesson = lesson;
        this.experiences = experiences;
    }

}

class UndergraduateStudent extends Member {
    protected int semester;
    public UndergraduateStudent(String fullName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear, int semester) {
        super(fullName, studentId, faculty, field, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.semester = semester;
    }
}

class GraduateStudent extends Member {
    protected int graduationYear;
    public GraduateStudent(String fullName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear, int graduationYear) {
        super(fullName, studentId, faculty, field, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.graduationYear = graduationYear;
    }
}