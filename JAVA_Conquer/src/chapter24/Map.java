package chapter24;

public class Map {
    // 맵핑은 스트림의 요소에서 일부르 ㄹ추출 및 조합하여, 다른 형태의 스트림을 만든다.
    public static void main(String[] args) {
        Data.nara.stream()
                .map(c -> c.name)
                .forEach(c -> System.out.print(c + " "));
    }
    // 다른 정보는 필요없고, 이름에 대한 정보만 추출하고 싶은 경우
}
