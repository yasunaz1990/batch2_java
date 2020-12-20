package operators;

public class BooleanOpsDemo {

    public static void main(String[] args) {

        // Boolean data --> label (yes, no)
        // It is used for decision making

        boolean isSnowing = true;
        boolean isRaining = true;

        // boolean operator enables [boolean expression]
        // [boolean data] [ops] [boolean data] ------> [boolean data]
        //
        // types of ops
        //    &&    AND
        //    ||    OR

        //  !(boolean expression) ---> [boolean data]
        //    !     NOT


        boolean letsStayHome = isSnowing && isRaining;
        //   bool1  && bool2  ---> bool3
        //  --------------------------------
        //    true  && true   ---> true
        //    true  && false  ---> false
        //    false && true   ---> false
        //    false && false  ---> false
       // System.out.println(letsStayHome);



        boolean milk = false;
        boolean egg  = false;
        boolean happy = milk || egg;
        //   bool1 || bool2 ---> bool3
        //   true  || false ---> true
        //   false || true  ---> true
        //   ture  || true  ---> true
        //   false || false ---> false
       // System.out.println(happy);



        boolean isDark = true;
        boolean ret = !isDark;
        System.out.println(ret);
        System.out.println(!false);


    }
}
