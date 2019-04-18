package chapter10;
// final 지정자가 붙은 상수 필드는 한 번 값이 정해지면 실행 중에는 값을 변경할 수 없다.
// static final로 지정하면 클래스에 단 하나의 값만 존재하며, 모든 객체가 이 값을 공유한다.
    // 선언할 때 명시적으로 초기화하여, 객체 생성 이전에 초기화한다.
    // 정적 초기화 블록을 사용하면 더 복잡한 초기화도 가능하다.
    // 만약 다른 클래스에서 GIGA 상수를 사용할 수 있도록 공개하고 싶다면, public 지정자도 붙일 수 있다.
class Laptop {
    final String CPU;
    int memory, storage;
    final static long GIGA = 1073741824L;

    public Laptop(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void upgrade(int memory, int storage) {
        this.memory = memory;
        this.storage = storage;
        // this.CPU = "Super Strong 16 core 8.5 GHz"; // 에러
    }

    void printSpec() {
        System.out.printf("CPU : %s, Memory : %d바이트, Storage : %d바이트\n",CPU, memory*GIGA, storage*GIGA);
    }
}
