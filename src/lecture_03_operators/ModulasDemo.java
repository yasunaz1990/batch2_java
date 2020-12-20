package lecture_03_operators;

import java.io.IOException;

public class ModulasDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
        // INT(ALL NUMBER) % 2 ---> {0, 1}
        // if the result is 0 ===> even number
        // if the result is 1 ===> odd number

        // {number} %  modNumber ---> {0,1...modNumber-1 }
        // {number} %  10        ---> {0,1,2,3,4,5,6,7,8,9}
        // {number} %  16        ---> {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}

        // {number} % 3 ---> {0,1,2}
        System.out.println(1535 % 3);

        // 0...100
        for(int i = 0; i < 100; i++) {
            System.out.print(i + " ");
            Thread.sleep(1000);
            int ans = i % 10;        // ---> {0,1,2,3,4,5,6,7,8,9}
            if(ans == 9) {
                System.out.print("\n");
            }
        }


        // {number} % 6 --> {0,1,2,3,4,5}
    }
}
