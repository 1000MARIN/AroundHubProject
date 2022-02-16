public class OneTen {
    public static void main(String[] args) {

        // 1 부터 10까지의 합을 출력하기
        int[] array = new int[10];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i <= array.length - 2) {
                System.out.print(array[i] + " + ");
            } else {
                System.out.print(array[i]);
            }
            sum = sum + array[i];
        }
        System.out.println(" = " + sum);
    }
}
