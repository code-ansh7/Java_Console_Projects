import java.util.Scanner;

public class Dashboard {
    void showDashboard(){
        System.out.println("=====================================");
        System.out.println("           Bank Dashboard          ");
        System.out.println("=====================================\n");
        System.out.println("1.Deposit Money.\n2.Withdraw Money.\n3.Check Balance.\n4.Logout.\n");
    }

    int dashboardChoice(Scanner sc){
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();
        return choice;
    }
}
