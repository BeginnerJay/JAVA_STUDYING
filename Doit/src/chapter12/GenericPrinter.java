package chapter12;

public class GenericPrinter<T extends Material> { // 제네릭 클래스에서 T 정의해줘야 쓸 수 있음.
    // extends 예약어로 사용할 수 있는 자료형에 제한을 두었다.
    // extends 예약어를 사용하지 않을 시, T는 compile할 때 Object 클래스로 변환된다.
        // 따라서 이 경우에 Object 클래스가 기본으로 제공하는 method만 사용할 수있다(자료형을 알 수 없으므로)
    // extends 예약어를 사용하면, T는 compile할 때에 Material 클래스로 변환된다.
        // 상위 클래스 Material에서 선언하거나 구현한 메서드를 모두 사용할 수 있다.
    private T material; // T 자료형으로 선언한 변수

    public T getMaterial() {
        return material; // T 자료형 변수 material을 반환하는 제네릭 메서드
    }
// 제네릭 메서드 : 메서드의 선언부나 매개변수로 자료형 매개변수 T를 사용한 메서드
    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting(); // 상위 클래스 Material의 메서드 호출
    }
}
