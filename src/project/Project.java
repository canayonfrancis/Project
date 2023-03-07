/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author canay
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("+--------------------+");
        System.out.println("|       Welcome      |");
        System.out.println("|                    |");
        System.out.println("|     1 - Login      |");
        System.out.println("|     2 - Register   |");
        System.out.println("|                    |");
        System.out.println("+--------------------+");
        greetings();
        
    }
    static void greetings() {
        Scanner input = new Scanner(System.in);
        System.out.print("Select Options: ");
        int options = input.nextInt();
        if(options == 1) {
            usersLogin();
        } else if(options == 2) {
            createUser();
        } else {
            System.out.println("Option does not exist.");
            greetings();
        }
        
    }
    static void usersLogin() {
        String[] users = {"Francis", "Lawrenz", "Canayon"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String name = input.nextLine();
        if(Arrays.asList(users).contains(name)) {
            System.out.println("Welcome");
        } else {
            System.out.println("The user that you enter does not exist!");
            usersLogin();
        }
    }
    static void createUser() {
        String[] users = new String[10]; // Initialize an array with 10 slots for users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the new user: ");
        String newUser = scanner.nextLine(); // Read the user input from the console
        users[0] = newUser; // Store the new user in the first slot of the array
        System.out.println("New user " + newUser + " has been created!");
    }
    
}
