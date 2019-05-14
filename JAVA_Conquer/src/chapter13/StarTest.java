package chapter13;

import static chapter13.Unit.moveAttack;

public class StarTest {
    public static void main(String[] args) {
        var marine = new Marine();
        marine.move();
        marine.attack();
        marine.die();
        var zealot = new Zealot();
        zealot.attack();
        zealot.move();
        zealot.die();
        // 인터페이스로 객체를 생성하는 것은 불가능하지만, 인터페이스 타입의 변수로 후손 클래스의 객체를 가리킬 수는 있다.
        Unit mutal = new Mutal();

        var darkTempler = new DarkTempler();
        var medic = new Medic();

        darkTempler.hide();
        medic.heal();

        Unit[] arUnit;
        arUnit = new Unit[]{
                new Firebat(),
                new Dragoon(),
                new Scurge(),
                new Ghost(),
        };

        for (Unit u : arUnit) {
            u.move();
            u.attack();
            moveAttack(u);
        }
    }
}
