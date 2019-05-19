package chapter12;

public class PeopleTest {
    // dumpgroup 메서드는 이 배열을 group parameter로 전달받아, 배열 요소를 순회하며 각 객체에 대한 intro 메서드 뽑는다.
    static void dumpGroup(Human[] group) {
        for (Human people : group) {
            people.intro();
        }
    }

    public static void main(String[] args) {
        // Human으로부터 파생된 모든 객체를 저장할 수 있다.
            // 사람 비슷한 모든 객체를 집합적을 ㅗ저장하려면, 공동의 조상인 Human 타입이어야 한다.
        Human[] people = {
                new Human(26, "김재욱"),
                new Student(26,"조성우", 13456789,"신문방송"),
                new Soldier(26, "천민석", 1796423879),
                new Thief(26, "김지혁", "부자집", 5),
                new Graduate(28, "김떙떙", 65498732, "전산", "컴파일러"),
        };
        // 새로운 클래스가 추가되었음에도, dumpgroup 메서드는 하나도 손대지 않았다.
        // 이것이 가능한 이유는 동적 바인딩이 컴파일 중이 아닌 실행 중에 호출할 메서들르 찾기 때문이다.
        dumpGroup(people);
    }
}
