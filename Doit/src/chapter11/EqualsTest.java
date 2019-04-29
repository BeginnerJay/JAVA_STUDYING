package chapter11;

public class EqualsTest {
    public static void main(String[] args) {
        Student studentCho = new Student(100, "조성우");
        Student studentCho2 = studentCho; // 주소 복사(같은 내용, 같은 주소, 같은 원본 가리킴)
        Student studentWoo = new Student(100, "조성우");

        // 동일한 주소의 두 인스턴스 비교
        if (studentCho == studentCho2) { // == 기호로 비교
            System.out.println("studentCho와 studentCho2의 주소는 같습니다.");
        } else {
            System.out.println("studentCho와 studentCho2의 주소는 다릅니다.");
        }
        if (studentCho.equals(studentCho2)) { // equals() 메서드로 비교
            System.out.println("studentCho와 studentCho2의 내용은 같습니다.");
        } else {
            System.out.println("studentCho와 studentCho2의 내용은 다릅니다.");
        }

        // 동일인이지만 인스턴스의 주소가 다른 경우
        if (studentCho == studentWoo) { // == 기호로 비교
            System.out.println("studentCho와 studentWoo의 주소는 같습니다.");
        } else {
            System.out.println("studentCho와 studentWoo의 주소는 다릅니다.");
        }
        if (studentCho.equals(studentWoo)) { // equals() 메서드로 비교
            System.out.println("studentCho와 studentWoo의 내용은 같습니다.");
        } else {
            System.out.println("studentCho와 studentWoo의 내용은 다릅니다.");
        }

        System.out.println("studentCho의 hashcode : " + studentCho.hashCode());
        System.out.println("studentWoo의 hashcode : " + studentWoo.hashCode());

        System.out.printf("studentCho의 실제 주소값 : %d\n", System.identityHashCode(studentCho));
        System.out.println("studentWoo의 실제 주소값 : " + System.identityHashCode(studentWoo));
    }
}
// 두 인스턴스가 있을 때
    // == 기호로는 단순히 물리적으로 같은 주소인지 여부를 확인할 수 있고,
    // Object 클래스의 equals() 메서드는 Override하여 논리적으로 같은 인스턴스인지 확인하도록 구현할 수 있다.