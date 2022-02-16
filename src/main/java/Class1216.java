import java.util.ArrayList;

public class Class1216 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int a;

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        for (int i = 0; i < arrayList.size(); i = i + 1) {
            // 실행문
//            System.out.println(i);
            System.out.println(arrayList.get(i));
        }

    }
}