package decisions;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        // [18 ~ 60]
        System.out.println("Enter you age to determine whether you can vote or not..");
        System.out.print("ENTER AGE: ");
        Scanner keybord = new Scanner(System.in);
        int age = keybord.nextInt();

        if(age < 18) {
            System.out.println("Sorry but you cannot vote!");
        }
        else if(age >= 18 && age <= 28) {
            System.out.println("You must vote, otherwise you have to pay fine");
        }
        else if(age >= 29 && age <= 60) {
            System.out.println("It is optional for you to vote...");
        }
        else {
            System.out.println("You are too old and cannot vote!");
        }
    }
}
