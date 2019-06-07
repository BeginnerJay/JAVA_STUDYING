package chapter21;

import java.io.Serializable;

public class Car implements Serializable {
    String name;
    String color;
    // 인스턴스 필드 중에 저장하고 싶지 않은 필드는 선언문에 transient 지정자를 붙인다.
    // 실행 중에 사용하는 임시 정보나, 효율 향상을 위해 사용하는 버퍼 등은
    // 언제든지 새로 생성할 수 있어 저장할 필요가 없다.
    transient boolean gasoline; // 저장되지 않으면 디폴트값인 false로 초기화된다.
    static int count = 0;

    public Car(String name, String color, boolean gasoline) {
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
        count++;
    }

    void outInfo() {
        System.out.printf("이름 : %s, 색상 = %s, 연료 = %s\n",
                name, color, gasoline? "휘발유" : "경유");
    }
}
