package inheritance;

public class Child extends Parent{

    public Child() {
        System.out.println("Child Constructor");
    }

    @Override
    public void printName() {
        System.out.println("Child Print"); // 오버라이딩 재정의
        super.printName();

    }


}
