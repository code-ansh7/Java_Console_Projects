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

    int dashboardChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
}