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

        int selectedNumber;
        do {
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
            } else if (selectedNumber == 2) {

            }
        } while (selectedNumber != 0);
    }

}