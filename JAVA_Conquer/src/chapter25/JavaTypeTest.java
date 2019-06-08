package chapter25;

public class JavaTypeTest {
    public static void main(String[] args) {
        JavaType Type;
        Type = JavaType.INT;

        System.out.println("타입 : " + Type + ", 이름 : " +
                Type.getName() + ", 길이 : " + Type.getLength());
    }
}
