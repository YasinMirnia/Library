import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Member {
    private String name;
    private String lastName;
    private int studentId;
    private String faculty;
    private String field;
    private int entranceYear;
    private int membershipDateDay;
    private int membershipDateMonth;
    private int membershipDateYear;

    // Constractor
    public Member(String name, String lastName, int studentId, String faculty, String field, int entranceYear, int membershipDateDay, int membershipDateMonth, int membershipDateYear) {
        this.name = name;
        this.lastName = lastName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.field = field;
        this.enentranceYear = entranceYear;
        this.membershmembershipDateDay = membershipDateDay;
        this.membershmembershipDateMonth = membershipDateMonth;
        this.membershipDateYear = membershipDateYear;
    }

    // Setter Methods member
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    // Getter Methods for member
   public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
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

    // Show information Method for member
    public void displayMemberInfo(){
        System.out.println("First Name:" + name);
        System.out.println("Last Name:" + lastName);
        System.out.println("Student Id:" + studentId);
        System.out.println("Faculty:" + faculty);
        System.out.println("Field:" + field);
        System.out.println("Entrance Year:" + entranceYear);
        System.out.println("Member Since:" + membershipDateDay + "/" + membershipDateMonth + "/" + membershipDateYear);
    }
}

public class Book {
    private int bookCode;
    private String title;
    private String author;
    private int publishYear;
    private String publisher;
    private int numberOfPages;
    private String orginalLanguage;

    // Constractor of book
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

    // Setter Methods of book
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

    // Gretter Methods of book
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

    // Show information method for book
    public void displayBookInfo() {
        System.out.println("Book's Code:" + bookCode);
        System.out.println("Book's Title:" + title);
        System.out.println("Book's Author:" + bookCode);
        System.out.println("Book's Publish Year:" + publishYear);
        System.out.println("Book's Publisher:" + publisher);
        System.out.println("Book's Number of Pages:" + numberOfPages);
        System.out.println("Book's Orginal Language:" + orginalLanguage);
    }
}

// Main Method
public class Library {
    public static void main(String[] args) {
        Member[] member = new Member();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Saturn's Library!");
        System.out.println("Select a Number for Countinue:");
        System.out.println("1: Add Member");
        System.out.println("2: Edit Member's Information");
        System.out.println("3: Delete Member");
        System.out.println("4: Add Book");
        System.out.println("5: Edit Book's Information");
        System.out.println("6: Delete Book");
        System.out.println("6: Delete Book");
        System.out.println("7: Exit");
        int selectedNumber = input.nextInt();
        for (int i = 0; selectedNumber != 7; i++){
            if (selectedNumber == 1){
                System.out.println("Adding a Member:");
                System.out.println("Enter member's Name:");
                member[i].name = input.nextLine();
                System.out.println("Enter member's Last Name:");
                member[i].lastName = input.nextLine();
                System.out.println("Enter member's Id:");
                member[i].studentId = input.nextInt();
                System.out.println("Enter member's Faculty:");
                member[i].faculty = input.nextLine();
                System.out.println("Enter member's Major:");
                member[i].field = input.nextLine();
                System.out.println("Enter member's Enrance Year:");
                member[i].enentranceYear = input.nextInt();
                System.out.println("Enter member's Membership Day:");
                member[i].membershipDateDay = input.nextInt();
                System.out.println("Enter member's Membership Month:");
                member[i].membershipDateMonth = input.nextInt();
                System.out.println("Enter member's Membership Year:");
                member[i].membershipDateYear = input.nextInt();
            }
        }
    }

}