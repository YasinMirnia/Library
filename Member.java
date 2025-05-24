public class Member {
    protected String fullName;
    protected int entranceYear;
    protected int membershipDateDay;
    protected int membershipDateMonth;
    protected int membershipDateYear;

    public Member(String fullName, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear) {
        this.fullName = fullName;
        this.entranceYear = entranceYear;
        this.membershipDateDay = membershipDateDay;
        this.membershipDateMonth = membershipDateMonth;
        this.membershipDateYear = membershipDateYear;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        System.out.println("2.Entrance Year: " + entranceYear);
        System.out.println("3.Member Since: " + membershipDateDay + "/" + membershipDateMonth + "/" + membershipDateYear);
    }
}

class Professor extends Member {
    protected int teachingCode;
    public Professor(String fullName, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear, int teachingCode) {
        super(fullName, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.teachingCode = teachingCode;
    }

    public void setTeachingCode(int teachingCode){
        this.teachingCode = teachingCode;
    }

    public int getTeachingCode(){
        return teachingCode;
    }

    @Override
    public void displayMemberInfo() {
        super.displayMemberInfo();
        System.out.println("4.Teaching Code: " + teachingCode);
    }

}

class UndergraduateStudent extends Member {
    protected int studentId;
    protected String faculty;
    protected String field;

    public UndergraduateStudent(String fullName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear) {
        super(fullName, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.studentId = studentId;
        this.faculty = faculty;
        this.field = field;
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

    public int getStudentId() {
        return studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getField() {
        return field;
    }

    @Override
    public void displayMemberInfo() {
    super.displayMemberInfo();
    System.out.println("4.Student Id: " + studentId);
    System.out.println("5.Faculty: " + faculty);
    System.out.println("6.Field: " + field);
}
}

class GraduateStudent extends Member {
    protected int studentId;
    protected String faculty;
    protected String field;
    protected int graduationYear;

    public GraduateStudent(String fullName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear, int graduationYear) {
        super(fullName, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear);
        this.studentId = studentId;
        this.faculty = faculty;
        this.field = field;
        this.graduationYear = graduationYear;
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

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
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

    public int getGraduationYear() {
        return graduationYear;
    }

    @Override
    public void displayMemberInfo() {
    super.displayMemberInfo();
    System.out.println("4.Student Id: " + studentId);
    System.out.println("5.Faculty: " + faculty);
    System.out.println("6.Field: " + field);
    System.out.println("7.Graduation Year: " + graduationYear);
}

}