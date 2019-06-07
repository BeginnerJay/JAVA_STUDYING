package chapter22;

public class Name {
    String first;
    String family;

    Name(String first, String family) {
        this.first = first;
        this.family = family;
    }

}
// Name zmffotmsms Human에서 사용할 필드를 세분화하여 정의하는 역할밖에 하지 않는다.
// 이럴 경우 Name 클래스를 아예 Human 클래스 안쪽에 선언하여 중첩한다.