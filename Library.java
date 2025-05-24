import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

// Main Method
public class Library {
    public static void main(String[] args) {
        List <Member> members = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Saturn's Library!\n");

        int selectedNumber;
        do {
        System.out.println("Select a Number for Countinue:");
        System.out.println("1: Add Member");
        System.out.println("2: Edit Member's Information");
        System.out.println("3: Delete Member");
        System.out.println("4: Display Member Information:");
        System.out.println("5: Display All Members:");
        System.out.println("6: Add Book");
        System.out.println("7: Edit Book's Information");
        System.out.println("8: Delete Book");
        System.out.println("9: Disply Book Information:");
        System.out.println("10: Disply Book Information:");
        System.out.println("0: Exit\n");
            selectedNumber = input.nextInt();
            if (selectedNumber == 1){
                System.out.println("Adding a Member:");
                
                System.out.println("Enter member's Full Name:");
                input.nextLine();
                String fullName = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter member's Id:");
                int studentId = input.nextInt();
                input.nextLine();
                System.out.println("\n");

                System.out.println("Enter member's Faculty:");
                String faculty = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter member's Major:");
                String major = input.nextLine();
                System.out.println("\n");

                System.out.println("Enter member's Enrance Year:");
                int entranceYear = input.nextInt();
                input.nextLine();
                System.out.println("\n");

                System.out.println("Enter member's Membership Day:");
                int membershipDateDay = input.nextInt();
                System.out.println("\n");

                System.out.println("Enter member's Membership Month:");
                int membershipDateMonth = input.nextInt();
                System.out.println("\n");

                System.out.println("Enter member's Membership Year:");
                int membershipDateYear = input.nextInt();
                System.out.println("\n");

                members.add(new Member(fullName, studentId, faculty, major, entranceYear, membershipDateDay, membershipDateMonth, membershipDateYear));
                System.out.println("Member has been Added Successfully");

            } else if (selectedNumber == 2) {
                System.out.println("You Are Editing Member's Information!");
                System.out.println("Choose A Member Using Student ID:\n");
                int selectMember = input.nextInt();
                for(int i = 0; i < members.size(); i++) {
                    Member searchMember = members.get(i);
                    if (searchMember.getStudentId() == selectMember) {
                        searchMember.displayMemberInfo();
                        System.out.println("which Info You Want to Edit?");
                        int selectEditNumber = input.nextInt();
                        do {
                            switch(selectEditNumber) {
                                case 1:
                                    System.out.println("Editing Member's Full Name:");
                                    System.out.println("Enter New Name:");
                                    searchMember.setFullName(input.nextLine());
                                    System.out.println("Member's Full Name has been edited!");
                                    break;
                                case 2:
                                    System.out.println("Editing Member's ID:");
                                    System.out.println("Enter New ID:");
                                    searchMember.setStudentId(input.nextInt());
                                    System.out.println("Members' Id has been edited!");
                                    break;
                                case 3:
                                    System.out.println("Editing Member's Faculty:");
                                    System.out.println("Enter New Faculty:");
                                    searchMember.setFaculty(input.nextLine());
                                    System.out.println("Member's Faculty has been edited!");
                                    break;
                                case 4:
                                    System.out.println("Editing Member's Major:");
                                    System.out.println("Enter New Major:");
                                    searchMember.setField(input.nextLine());
                                    System.out.println("Members's Major has been edited!");
                                    break;
                                default:
                                    System.out.println("You Got Back!\n");
                                }
                        } while (selectEditNumber < 1 || selectEditNumber > 4);
                    } else {
                        System.out.println("Member Not Found!\n");
                    }
                }
            }
        } while (selectedNumber != 0);
    }

}