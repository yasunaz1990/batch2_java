package lecture_04_controls;

public class IfElseStatement {

    public static void main(String[] args) {
        // If..else statement:
        //      Checks the condition, if its true then the code inside the if block will
        //      be executed, if the condition is false, then the code inside the else block will
        //      be executed.
        // ----------------------------
        //  Syntax:
        //             if(  condition )  {
        //                // codes
        //             }
        //             else {
        //                // alternate code
        //             }
        int userAge = 10;

        if(userAge <= 18) {
            System.out.println("I am sorry!");
            System.out.println("But you are not eligible for voting...");
        }else {
            System.out.println("You are older than 18 years old...go ahead and vote now!");
        }



    }
}
