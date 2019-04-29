package chapter11;

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,30);
        // clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복사했다.
        Circle copyCircle = (Circle)circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}

// 인스턴스의 멤버 변수 값은 같고 주소 값은 다른 copyCircle이 생성되었음을 알 수 있다.