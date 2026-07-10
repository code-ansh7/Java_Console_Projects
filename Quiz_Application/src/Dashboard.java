import java.util.Scanner;
public class Dashboard{
    void showDashboard(){
        System.out.println("========================================");
        System.out.println("            Java Quiz App               ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("            1.Start Quiz.               ");
        System.out.println("            2.View Rules.               ");
        System.out.println("            3.Exit.                     ");
        System.out.println();
     }

    int dashboardChoice() throws InvalidChoiceException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice >= 1 && choice <= 3) return choice;
        throw new InvalidChoiceException("Please Enter only 1, 2 or 3.");
    }

    void viewRules(){
        System.out.println("========================================");
        System.out.println("               QUIZ RULES               ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("1. There are 15 Questions.");
        System.out.println("2. Each Question carries 1 mark.");
        System.out.println("3. Enter only A, B, C or D.");
        System.out.println("4. Answer are not case-sensitive.");
        System.out.println("5. No negative marking.");
        System.out.println("6. Result will be shown after quiz.");
        System.out.println();
        System.out.println("Good Luck!");
        System.out.println();
        System.out.println("========================================");       
    }
}