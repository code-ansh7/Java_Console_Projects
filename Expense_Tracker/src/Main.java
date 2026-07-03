import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("          Expense Tracker          ");
        System.out.println("===================================");
        System.out.println();
        System.out.println("1.Add Expense.");
        System.out.println("2.View Expense.");
        System.out.println("3.Search Expense.");
        System.out.println("4.Delete Expense.");
        System.out.println("5.Total Expense.");
        System.out.println("6.Exit.");
        System.out.println();

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1: 
                    ExpenseManager em = new ExpenseManager();
                    em.addExpense();
                    break;

            case 2: System.out.println("Coming Soon...");
            break;
            case 3: System.out.println("Coming Soon...");
            break;
            case 4: System.out.println("Coming Soon...");
            break;
            case 5: System.out.println("Coming Soon...");
            break;
            case 6: System.out.println("Coming Soon...");
            break;
        }

    }
}
