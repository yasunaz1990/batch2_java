package variables;

import java.util.Locale;

public class VariableExplanation {

    public static void main(String[] args) {
        // Variable
        // Names temp data storage
        String clientName = "Basak Gumus";
        boolean isRight = false;

        // =   : assignment operator
        // Type Checked
        // Content updates
        System.out.println(clientName);               // printing
        System.out.println(clientName.toUpperCase()); // data manipulation

        clientName = "Alishir Enver";


        // 1st way of creating a variable
        int data;    // create empty storage
        data = 100;  // assign a data value to the storage

        // 2nd way of creating a variable
        int myData = 200;

        int currentYear;
        //System.out.println(currentYear);


        // Variable Naming
        // [data-type] [name] = data;
        // - camelCaseNotation
        // - snake_case_notation
        // - name of the variable must describes the data
        // - only letters and numbers are allowed (exceptions $ and _ )
        // - first char cannot be a number

        final double PI = 3.14;         // Constants
        //  PI = 6.14;
        // final  <--- operator: it prohibits data override

        final double myAccountNumber;
        myAccountNumber = 10024234;


        // Creating a multiple
        int scoreOne, scoreTwo, scoreThree, scoreFour;
        scoreOne = 100;
        scoreTwo = 200;
        scoreThree = 145;
        scoreFour = 90;

        String nameOne = "nijat", nameTwo, nameThree;
        nameTwo = "Alishir";
        nameThree = "Alex";

    }
}





