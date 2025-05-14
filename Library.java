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

    // Setter Methods
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

    // Getter Methods
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

    // Show information Method
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

    // Constractor
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

    // Setter Methods
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

    // Gretter Methods
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
}

// Main Method
public class Library {
    public static void main(String[] args) {
    }

}