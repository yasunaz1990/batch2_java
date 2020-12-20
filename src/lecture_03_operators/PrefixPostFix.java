package lecture_03_operators;

public class PrefixPostFix {

    public static void main(String[] args) {

        // Prefix
        // Postfix
        // adding one or increment by one (++)
        // subtract one or decrement by one (--)

        int number = 10;
        number++;         // postfix  -->  last thing that you will exeucte
        System.out.println(number);

        ++number;         // prefix   -->  the first that you will excute
        System.out.println(number);


        int anotherNumber = 20;
        anotherNumber--;         // postfix
        System.out.println(anotherNumber);

        --anotherNumber;         // prefix
        System.out.println(anotherNumber);


        System.out.println("\n\n=================EXAMPLE====================");
        // Example

        int someValue = 10;
        System.out.println(++someValue);  // 1




    }
}
