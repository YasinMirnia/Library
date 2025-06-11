import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Borrow> borrows = new ArrayList<>();
        int i = 0;

        System.out.println("Welcome to Saturn's Library!\n");

        int selectedNumber;
        do {
            System.out.println("Select a Number for Continue:");
            System.out.println("1: Add Member");
            System.out.println("2: Edit Member's Information");
            System.out.println("3: Delete Member");
            System.out.println("4: Add Book");
            System.out.println("5: Edit Book's Information");
            System.out.println("6: Delete Book");
            System.out.println("7: Borrow Book");
            System.out.println("8: Reserve Book");
            System.out.println("0: Exit\n");
            selectedNumber = input.nextInt();

            if (selectedNumber == 1) {
                System.out.println("\n");
                System.out.println("Adding a Member:");
                System.out.println("1.UndergraduateStudent");
                System.out.println("2.GraduateStudent");
                System.out.println("3.AssociateStudent");
                int selectMemberType = input.nextInt();

                if (selectMemberType == 1) {
                    System.out.println("Enter Student's Full Name:");
                    input.nextLine();
                    String fullName = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Id:");
                    int studentId = input.nextInt();
                    System.out.println("\n");
                    input.nextLine();

                    System.out.println("Enter Student's Faculty:");
                    String faculty = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Major:");
                    String major = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Entrance Year:");
                    int entranceYear = input.nextInt();
                    input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Day:");
                    int membershipDateDay = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Students's Membership Month:");
                    int membershipDateMonth = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Year:");
                    int membershipDateYear = input.nextInt();
                    System.out.println("\n");

                    members.add(
                        new UndergraduateStudent(
                            fullName,
                            studentId,
                            faculty,
                            major,
                            entranceYear,
                            membershipDateDay,
                            membershipDateMonth,
                            membershipDateYear
                        )
                    );
                    System.out.println("Student has been Added Successfully\n");

                } else if (selectMemberType == 2) {
                    System.out.println("Enter Student's Full Name:");
                    input.nextLine();
                    String fullName = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Id:");
                    int studentId = input.nextInt();
                    input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Faculty:");
                    String faculty = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Major:");
                    String major = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Entrance Year:");
                    int entranceYear = input.nextInt();
                    input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Day:");
                    int membershipDateDay = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Students's Membership Month:");
                    int membershipDateMonth = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Year:");
                    int membershipDateYear = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Student's Graduation Year:");
                    int graduationYear = input.nextInt();
                    System.out.println("\n");

                    members.add(
                        new GraduateStudent(
                            fullName,
                            studentId,
                            faculty,
                            major,
                            entranceYear,
                            membershipDateDay,
                            membershipDateMonth,
                            membershipDateYear,
                            graduationYear
                        )
                    );
                    System.out.println("Student has been Added Successfully\n");

                } else if (selectMemberType == 3) {
                    System.out.println("Enter Student's Full Name:");
                    input.nextLine();
                    String fullName = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Id:");
                    int studentId = input.nextInt();
                    System.out.println("\n");
                    input.nextLine();

                    System.out.println("Enter Student's Faculty:");
                    String faculty = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Major:");
                    String major = input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Entrance Year:");
                    int entranceYear = input.nextInt();
                    input.nextLine();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Day:");
                    int membershipDateDay = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Students's Membership Month:");
                    int membershipDateMonth = input.nextInt();
                    System.out.println("\n");

                    System.out.println("Enter Student's Membership Year:");
                    int membershipDateYear = input.nextInt();
                    System.out.println("\n");

                    members.add(
                        new AssociateStudent(
                            fullName,
                            studentId,
                            faculty,
                            major,
                            entranceYear,
                            membershipDateDay,
                            membershipDateMonth,
                            membershipDateYear
                        )
                    );
                    System.out.println("Student has been Added Successfully\n");
                }
            } else if (selectedNumber == 2) {
                System.out.println("\n");
                System.out.println("You Are Editing Member's Information!");
                System.out.println("Choose A Member Using Student ID:\n");
                int selectMember = input.nextInt();
                boolean found = false;
                for (i = 0; i < members.size(); i++) {
                    Member searchMember = members.get(i);
                    if (searchMember.getStudentId() == selectMember) {
                        searchMember.displayMemberInfo();
                        System.out.println("which Info You Want to Edit? choose between 1 to 4");
                        int selectedEditNumber = input.nextInt();
                        do {
                            switch (selectedEditNumber) {
                                case 1:
                                    System.out.println("Editing Member's Full Name:");
                                    System.out.println("Enter New Name:");
                                    input.nextLine();
                                    searchMember.setFullName(input.nextLine());
                                    System.out.println("Member's Full Name has been edited!\n");
                                    break;
                                case 2:
                                    System.out.println("Editing Member's ID:");
                                    System.out.println("Enter New ID:");
                                    searchMember.setStudentId(input.nextInt());
                                    System.out.println("Members' Id has been edited!\n");
                                    break;
                                case 3:
                                    System.out.println("Editing Member's Faculty:");
                                    System.out.println("Enter New Faculty:");
                                    input.nextLine();
                                    searchMember.setFaculty(input.nextLine());
                                    System.out.println("Member's Faculty has been edited!\n");
                                    break;
                                case 4:
                                    System.out.println("Editing Member's Major:");
                                    System.out.println("Enter New Major:");
                                    input.nextLine();
                                    searchMember.setField(input.nextLine());
                                    System.out.println("Member's Major has been edited!\n");
                                    break;
                                default:
                                    System.out.println("You Got Back!\n");
                            }
                            System.out.println("Enter a number for Continue or 0 for Exit:");
                            selectedEditNumber = input.nextInt();
                        } while (selectedEditNumber != 0);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Member Not Found!\n");
                }
            } else if (selectedNumber == 3) {
                System.out.println("\n");
                System.out.println("You Are Deleting a Member:");
                System.out.println("Choose A Member Using Student ID:\n");
                int selectMember = input.nextInt();
                boolean found = false;
                for (i = 0; i < members.size(); i++) {
                    Member searchMember = members.get(i);
                    if (searchMember.getStudentId() == selectMember) {
                        found = true;
                        searchMember.displayMemberInfo();
                        System.out.println(
                            "Are you sure for deleting this Member? Only 'Yes' or 'No'!\n"
                        );
                        input.nextLine();
                        String answer = input.nextLine();
                        if (answer.equals("Yes")) {
                            members.remove(i);
                            System.out.println("Member Has Been Deleted!\n");
                        } else if (answer.equals("No")) {
                            System.out.println("You are Back!\n");
                        } else {
                            System.out.println("Invalid Value!\n");
                        }
                    }
                }
                if (!found) {
                    System.out.println("Member Not Found!\n");
                }
            } else if (selectedNumber == 4) {
                System.out.println("\n");
                System.out.println("Adding a Book:");

                System.out.println("Enter Book's Code:");
                int bookCode = input.nextInt();
                input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Title:");
                String title = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Author:");
                String author = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Publish Year:");
                int publishYear = input.nextInt();
                input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Publisher:");
                String publisher = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Pages:");
                int numberOfPages = input.nextInt();
                input.nextLine();
                System.out.println("\n");

                System.out.println("Enter Book's Original Language:");
                String orginalLanguage = input.nextLine();
                System.out.println("\n");

                books.add(
                    new Book(
                        bookCode,
                        title,
                        author,
                        publishYear,
                        publisher,
                        numberOfPages,
                        orginalLanguage
                    )
                );
                System.out.println("Book Is Successfully added\n");
            } else if (selectedNumber == 5) {
                System.out.println("\n");
                System.out.println("You Are Editing Book's Information!");
                System.out.println("Choose A Book Using Book's Code:\n");
                int selectBook = input.nextInt();
                boolean found = false;
                for (i = 0; i < books.size(); i++) {
                    Book searchBook = books.get(i);
                    if (searchBook.getBookCode() == selectBook) {
                        searchBook.displayBookInfo();
                        System.out.println("which Info You Want to Edit?");
                        int selectedEditNumber = input.nextInt();
                        do {
                            switch (selectedEditNumber) {
                                case 1:
                                    System.out.println("Editing Book's Code:");
                                    System.out.println("Enter New Code:");
                                    input.nextLine();
                                    searchBook.setBookCode(input.nextInt());
                                    System.out.println("Book's Code has been edited!\n");
                                    break;
                                case 2:
                                    System.out.println("Editing Book's Title:");
                                    System.out.println("Enter New Title:");
                                    input.nextLine();
                                    searchBook.setTitle(input.nextLine());
                                    System.out.println("Book's Title has been edited!\n");
                                    break;
                                case 3:
                                    System.out.println("Editing Book's Author:");
                                    System.out.println("Enter New Author:");
                                    input.nextLine();
                                    searchBook.setAuthor(input.nextLine());
                                    System.out.println("Book's Author has been edited!\n");
                                    break;
                                case 4:
                                    System.out.println("Editing Book's Publish Year:");
                                    System.out.println("Enter New Publish Year:");
                                    input.nextLine();
                                    searchBook.setPublishYear(input.nextInt());
                                    System.out.println("Book's Publish Year has been edited!\n");
                                    break;
                                case 5:
                                    System.out.println("Editing Book's Publisher:");
                                    System.out.println("Enter New Publisher:");
                                    input.nextLine();
                                    searchBook.setPublisher(input.nextLine());
                                    System.out.println("Book's Publisher has been edited!\n");
                                    break;
                                case 6:
                                    System.out.println("Editing Book's Number of Pages:");
                                    System.out.println("Enter New Number of Pages:");
                                    input.nextLine();
                                    searchBook.setNumberOfPages(input.nextInt());
                                    System.out.println("Book's Number of Pages has been edited!\n");
                                    break;
                                case 7:
                                    System.out.println("Editing Book's Original Language:");
                                    System.out.println("Enter New Original Language:");
                                    input.nextLine();
                                    searchBook.setOrginalLanguage(input.nextLine());
                                    System.out.println(
                                        "Book's Original Language has been edited!\n"
                                    );
                                    break;
                                default:
                                    System.out.println("You Got Back!\n");
                            }
                            System.out.println("Enter a number for Continue or 0 for Exit:");
                            selectedEditNumber = input.nextInt();
                        } while (selectedEditNumber != 0);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Book Not Found!\n");
                }
            } else if (selectedNumber == 6) {
                System.out.println("\n");
                System.out.println("You Are Deleting a Book:");
                System.out.println("Choose A Book Using book's Code:\n");
                int selectBook = input.nextInt();
                boolean found = false;
                for (i = 0; i < books.size(); i++) {
                    Book searchBook = books.get(i);
                    if (searchBook.getBookCode() == selectBook) {
                        found = true;
                        searchBook.displayBookInfo();
                        System.out.println(
                            "Are you sure for deleting this Book? Only 'Yes' or 'No'!\n"
                        );
                        input.nextLine();
                        String answer = input.nextLine();
                        if (answer.equals("Yes")) {
                            books.remove(i);
                            System.out.println("Book Has Been Deleted!\n");
                        } else if (answer.equals("No")) {
                            System.out.println("You are Back!\n");
                        } else {
                            System.out.println("Invalid Value!\n");
                        }
                    }
                }
                if (!found) {
                    System.out.println("Book Not Found!\n");
                }
            } else if (selectedNumber == 7) {
                System.out.println("\n");
                System.out.println("Borrow Book\n");

                System.out.println("Select who want to Borrow?");
                System.out.println("Enter Student ID:");
                int selectMember = input.nextInt();
                boolean found = false;
                for (i = 0; i < members.size(); i++) {
                    Member searchMember = members.get(i);
                    if (searchMember.getStudentId() == selectMember) {
                        found = true;
                        searchMember.displayMemberInfo();
                        System.out.println("\n");
                        System.out.println("Which Book He/She wants To Borrow?");
                        System.out.println("Enter Book Code:");
                        int selectBook = input.nextInt();
                        boolean foundBook = false;
                        for (int j = 0; j < books.size(); j++) {
                            Book searchBook = books.get(j);
                            if (searchBook.getBookCode() == selectBook) {
                                foundBook = true;
                                searchBook.displayBookInfo();
                                if (searchBook.isAvailable() == true){
                                    System.out.println("\n Book is available for Borrow");
                                    if (searchMember.getMemberBorrowedBooks() <= 3) {
                                        searchBook.displayBookInfo();
                                        System.out.println("Borrowed By:");
                                        System.out.println(searchMember.getFullName());
                                        System.out.println(searchMember.getStudentId());
                                        searchBook.setAvailable(false);
                                        searchMember.increaseBorrowedBooks();
                                        searchBook.setAvailableForReserve(true);
                                        System.out.println("\n");
                                        break;
                                    } else {
                                        System.out.println("Member Reached Maximum for Borrow!\n");
                                        break;
                                    }
                                } else {
                                    System.out.println("Book is not Available for Borrow.\n");
                                    break;
                                }
                            }
                            if (!foundBook) {
                                System.out.println("Book Not Found!\n");
                                break;
                            }
                        }
                    }
                } if (!found) {
                    System.out.println("Member Not Found!\n");
                }
            } else if (selectedNumber == 8) {
                System.out.println("\n");
                System.out.println("Reserve Book\n");

                System.out.println("Select who want to Reserve?");
                System.out.println("Enter Student ID:");
                int selectMember = input.nextInt();
                boolean found = false;
                for (i = 0; i < members.size(); i++) {
                    Member searchMember = members.get(i);
                    if (searchMember.getStudentId() == selectMember) {
                        found = true;
                        searchMember.displayMemberInfo();
                        System.out.println("\n");
                        System.out.println("Which Book He/She wants To Reserve?");
                        System.out.println("Enter Book Code:");
                        int selectBook = input.nextInt();
                        boolean foundBook = false;
                        for (int j = 0; j < books.size(); j++) {
                            Book searchBook = books.get(j);
                            if (searchBook.getBookCode() == selectBook) {
                                foundBook = true;
                                searchBook.displayBookInfo();
                                if (searchBook.isAvailableForReserve() == true){
                                    System.out.println("\n Book is available for Reserve");
                                    if (searchMember.getReservedBooks() <= 3) {
                                        searchBook.displayBookInfo();
                                        System.out.println("Reserved By:");
                                        System.out.println(searchMember.getFullName());
                                        System.out.println(searchMember.getStudentId());
                                        searchMember.increaseReservedBooks();
                                        System.out.println("\n");
                                        break;
                                    } else {
                                        System.out.println("Member Reached Maximum for Reserve!\n");
                                        break;
                                    }
                                } else {
                                    System.out.println("Book is not Available for Reserve Please Borrow it!\n");
                                    break;
                                }
                            }
                            if (!foundBook) {
                                System.out.println("Book Not Found!\n");
                                break;
                            }
                        }
                    }
                } if (!found) {
                    System.out.println("Member Not Found!\n");
                }
            } else if (selectedNumber == 0) {
                System.out.println("See You Soon!\n");
            } else {
                System.out.println("Ivalid Number!\n");
            }
        } while (selectedNumber != 0);
    }
}
