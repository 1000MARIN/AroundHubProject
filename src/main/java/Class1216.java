import java.util.ArrayList;

public class Class1216 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[0][4] = 5;

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        int a = 0;
        while (a < 5) {
            a++;
            System.out.println(a);
        }
    }
}