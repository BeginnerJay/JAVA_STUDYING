package chapter12;

class DeliveryMan {
    // 이런 식으로 조합을 취하면, 하나의 메서드가 처리할 수 있는 경우의 수는 기하급수적으로 늘어나며, 유연해진다.
    // 객체는 프로그램을 구성하는 부품이며, 다형성에 의해 부품들끼리 호환됨으로써 필요에 의해 쉽게 교체 가능하다.
    void delivery(Transport tran, String food) {
        tran.ride();
        System.out.printf("타고 가서 %s를 배달합니다.\n",food);
    }
}
