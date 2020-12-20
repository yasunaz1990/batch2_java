package operators;

public class CompoundAssignment {

    public static void main(String[] args) {

        // ------ Compound Assignment Operator -------------- //
        // Basic Ops:       +, -, /, *, %
        // Assignment Ops:  =
        // -----------------------------------
        //                +=, -=, /=, *=, %=
        // variable content updater
        int val = 2;
        int number = 10;

        number *= val;
        System.out.println(number);  // 20


        int fav = 100;
        fav += 20;

        System.out.println(fav);  // 120
    }
}
