package inheritance;

public class InheritancePrint {
    public static void main(String[] args) {
        Child child = new Child();  // 생성자 호출 (부모 -> 자식)
        child.printName();          // 메소드 호출 (부모의 클래스 안에 있는 메소드도 출력 가능)
    }
}
