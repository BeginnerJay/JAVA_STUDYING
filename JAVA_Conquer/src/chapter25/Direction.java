package chapter25;
/*
자바의 열거형은 열거 상수에 츄가 정보를 저장하는 기능을 제공한다.
    정보를 저장하기 위한 필드를 선언한다. 이 필드는 내부적인 정보를 저장하므로 반드시 private
        열거 변수마다 달라질 필요는 없어 final로 선언한다.
    필드를 초기화할 생성자를 선언한다. 생성자는 정보에 해당하는 인수를 전달받아 내부 필드를 초기화한다.
    각 상수에 대입할 추가 정보는 열거 상수 목록의 상수 다음에 괄호와 함께 적으며,
        이 값이 생성자로 전달되어 필드에 대입된다.
    필드는 외부에서 접근할 수 없으므로, 이 값을 읽어 주는 공개 메서드도 필요하다.
        단순히 숨겨진 필드를 리턴하면 된다.
 */
public enum Direction {

    EAST("동"),
    WEST("서"),
    SOUTH("남"),
    NORTH("북");

    final private String hanDir;

    Direction(String han) {
        hanDir = han;
    }

    public String getHanDir() {
        return hanDir;
    }
}
