package lecture_03_operators;

public class Contact {

    public static void main(String[] args) {

       // concat   "text1" + "text2" ----> "text1text2"
        String ex1 = "tree" + "water";
        System.out.println(ex1);         // "treewater"

        // if one side of + is text data,
        // then + will be treated as concat ops
        String ex2 = "tree" + 1;
        System.out.println(ex2);   // "tree1"

    }
}
