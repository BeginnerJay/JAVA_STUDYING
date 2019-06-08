package chapter24;

public class OrElseTest {
    public static void main(String[] args) {
        Human jwKim = new Human(26, "김재욱", "15인치");
        Human yjKim = new Human(26, "김윤지", "13인치");
        useBook(jwKim);
        useBook(yjKim);
    }


    static void useBook(Human human) {
        Notebook book = human.book.orElse(new Notebook("싸구려"));
        System.out.printf("내 노트북 : %s\n", book.model);
    }
}
/*
orElse는 객체를 인수열에서 미리 만들기 때문에, 어쟀거나 객체를 만들어 놓고 본다.
이에 비해 orElseGet은 객체가 아니라 객체를 생성하는 람다식을 전달하여,
    불필요할 경우 아예 객체를 생성하지 않는다.

orElse는 객체를 만들어 주고 선택 여부를 결정하지만,
orElseGet은 객체를 만드는 방법을 가르쳐 주고 실행할 것인가를 결정한다.
orElseThrow는 객체가 비어 있을 때 예외를 던진다.
 */