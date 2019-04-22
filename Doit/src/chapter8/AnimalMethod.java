// 8.6 다운 캐스팅과 instanceof
    // Human class에 더 많은 method가 구현되어 있고, 다양한 멤버 변수가 있더라도 type이 Aniaml이면 사용할 수 없다.
    // 따라서 필요에 따라 다시 원래 인스턴스의 자료형으로 돌아갈 필요가 있다.
    // 이렇게 상위 클래스로 형 변환되었던 subclass를 다시 원래 자료형으로 casting하는 것을 down casting이라고 한다.

    // instanceof
        // 다운캐스팅을 하기 전에 superclass로 casting된 instance의 원래 type을 확인해야 변환 시 오류 막을 수 있다.
        // instanceof 예약어는 왼쪽에 있는 변수의 원래 인스턴스형이 오른쪽 클래스 자료형인가를 확인한다.
        // 참조 변수의 원래 인스턴스형을 정확히 확인하고 다운캐스팅을 해야 안전하며, 이 때 instanceof를 사용한다.
package chapter8;
import java.util.ArrayList;
public class AnimalMethod {
    ArrayList<Animal> aniList = new ArrayList<Animal>();

    public void addAnimal() {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for (Animal ani : aniList) {
            ani.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) { // 모든 배열 요소를 하나씩 돌면서
            Animal ani = aniList.get(i); // Animal 자료형으로 가져온다.
            if (ani instanceof Human) { // 만약 ani가 Human이면
                Human human = (Human)ani; // Human 형으로 다운캐스팅
                human.readBook();
            }
            else if (ani instanceof Tiger) {
                Tiger tiger = (Tiger)ani;
                tiger.hunting();
            }
            else if (ani instanceof Eagle) {
                Eagle eagle = (Eagle)ani;
                eagle.flying();
            }
            else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}
