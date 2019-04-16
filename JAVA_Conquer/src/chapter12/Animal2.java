package chapter12;
// 12-1-2. 객체 캐스팅
// 캐스트 연산자는 변수의 타입을 일시적으로 변경한다. 객체도 캐스트 연산자로 타입을 바꿀 수 있다.
// 그러나 아무 상관이 없는 객체끼리의 캐스팅은 불가능하고, 상속 관계가 있을 경우에만 가능하다.
// 부모 < - > 자식 Cassting이 그 예이다.
    // from sub to super -> up casting(항상 안전하다)
    // from super to sub -> down casting(위험할 수 있음)


class JavaTest2 {
    public static void main(String[] args) {
        Animal animal2 = new Animal();
        Dog dog2 = new Dog();

        // up casting
        Animal up = (Animal)dog2;
        up.move();
        //up.bark(); error occurs

        // down casting
        Dog down = (Dog)animal2;
        down.move();
        down.bark();
    }
}
// up의 선언 타입이 Animal2이므로 이 변수로는 move만 호출할 수 있다. 현재 개를 가리키고 있는데 개는 이동 가능하다.
// 그러나 실제 개를 가리키고 있더라도, 선언 타입이 Animal이어서 bark는 호출할 수 없다.(주석 풀면 컴파일 에러)
// 불가능한 동작은 컴파일 단계에서 에러 처리되어 가능한 동작만 허가됨 -> 업 캐스팅은 안전
// 개는 동물이 할 수 있는 것은 다 가능 -> 업 캐스팅은 캐스트 연산자 생략 가능 like Animal up = dog2;

// Dog 타입의 변수 down에 동물 객체 animal2를 대입하되, 좌우 타입이 달라 Dog로 강제 캐스팅했다.
// 상속 관계이므로 문법적으로 가능하지만, 위험하다.
// animal은 동물이지만 개가 아니므로 짖을 수 없다. 따라서 animal 객체로 bark 메서드를 호출할 수 없는데도
// 컴파일러는 down이 Dog 타입이므로 bark를 호출할 수 있다고 생각함 -> 컴파일 에러 나지 않고 실행 후 에러난다.
