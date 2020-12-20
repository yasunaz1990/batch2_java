package lecture_03_operators;

public class OperatorDemo {



    public static void main(String[] args) {
        // Operator --> allow us to manipulate stored data
        // Arithmetic Operators
        //  1) basic                   {+, -, *, /, % }
        //  2) prefix/postfix          {++, --}
        //  3) compound assignment     {+=, -=, *=, /=, %= }
        //  4) concat                  "text" + "word" ---> "textword"
        //  5) boolean ops
        // Integer, Decimal

        //------------ Basic Operators ---------------
        // addition
        int numberOne = 10;
        int numberTwo = 70;
        int answer = numberOne + numberTwo;
        System.out.println(answer);

        int ans = 890 + 90;

        // subtract
        int currentYear = 2020;
        int birthYear = 1999;
        int result = currentYear - birthYear;
        System.out.println(result);

        // Multiply
        int lucky = 7;
        int multiplier = 11;
        int myFinalNumber = lucky * multiplier;
        System.out.println(myFinalNumber);

        // Divide
        //   int / int ---> int
        //   double /int   --> double
        //   int / double  --> double
        int number1 = 7;
        double number2 = 2;
        System.out.println(number1/number2);  // 3.333333

        // Modules
        // % -- R
        System.out.println( 10 % 3);
        int userInput = 13241345;
        System.out.println(userInput % 2);

        // INT(ALL NUMBER) % 2 ---> {0, 1}
        // if the result is 0 ===> even number
        // if the result is 1 ===> odd number

        // {number} %  modNumber ---> {0,1...modNumber-1 }
        // {number} %  10        ---> {0,1,2,3,4,5,6,7,8,9}
        // {number} %  16        ---> {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}

        // {number} % 3 ---> {0,1,2}
        System.out.println();
    }
}
