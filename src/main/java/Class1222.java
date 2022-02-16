public class Class1222 {

    private String name;

    public Class1222() {
        name = "홍길동";
    }

    public Class1222(String a) {
        this.name = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String a) {
        this.name = a;
    }

    public static void main(String[] args) {
        Class1222 a = new Class1222();  // name = "홍길동"
        String name = a.name;           // 옳지 않은 방법
        String name2 = a.getName();     // 옳은 방법법

        System.out.println(name);
        System.out.println(name2);

        Class1222 b = new Class1222();
        b.setName("김보라");
        String bName = b.getName();
        System.out.println(bName);

        System.out.println(name);
        System.out.println(name2);

        Class1222 c = new Class1222("김땡땡");
        System.out.println(c.getName());
    }

}
