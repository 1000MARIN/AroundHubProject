public class Gugudan {
    public static void main(String[] args) {

        // 구구단 출력하기
        /**
         * 1 x 1 = 1    1 x 2 = 2
         * ........
         * .................................. 9 x 9 = 81
         */
        int leftValue = 1;
        for (int i = 0; i < 9; i++) {
            int rightValue = 1;
            for (int z = 0; z < 9; z++) {
                System.out.print(leftValue + " x " + rightValue + " = " + (leftValue * rightValue) + "\t");
                rightValue++;
            }
            leftValue++;
            System.out.println();
        }
    }
}
