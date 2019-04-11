package chapter7;
// 향상된 for문 사용하기
// 향상된 for문은 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용하면 편리하다.
// 따로 초기화와 종료 조건이 없기 때문에, 모든 배열의 시작부터 끝까지 실행한다.
public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for (String lang : strArray) {
            System.out.println(lang); // 변수에는 배열의 각 요소가 대입된다.
        }
    }
}
