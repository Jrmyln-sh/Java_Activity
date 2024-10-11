/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package management;
import java.util.Scanner;
/**
 *
 * @author Jeremy
 */
public class Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user_management login_register = new user_management();
        login_register.user_choose();
    }
    
}
class user_management {
    private String username;
    private String password;
public void user_choose() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option: 1. Registration 2. Login");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                user_registration();
            } else if (choice == 2) {
                if (username == null || password == null) {
                    System.out.println("You need to register first.");
                } else if (user_login()) {
                    System.out.println("Successfully logged in");
                    break;
                } else {
                    System.out.println("Incorrect credentials. Please try again.");
                }
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
    public void user_registration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Hobby: ");
        String Hobby = scanner.nextLine();
        System.out.println("Enter Username: ");
        this.username = scanner.nextLine();
        System.out.println("Enter Password: ");
        this.password = scanner.nextLine();
        System.out.println("Registration successful. You can now login.");
    }
    public boolean user_login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String input_username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String input_password = scanner.nextLine();
        
        return this.username.equals(input_username) && this.password.equals(input_password);
    }
}
