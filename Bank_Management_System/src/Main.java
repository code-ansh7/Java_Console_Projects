import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("   BANK MANAGEMENT SYSTEM v1.0     ");
        System.out.println("===================================");
        System.out.println();
        System.out.print("1.Create Account.\n2.Login.\n3.Exit.");
        System.out.println();   
        System.out.print("\nEnter Your Choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println("Create Account Selected.");
                    break;
            case 2: System.out.println("Login Selected.");
                    break;
            case 3: System.out.println("Thank You For Using My Bank Management System.");
                    break;
            default: System.out.println("Invalid Choice.");

        }
        sc.close();
    }
}