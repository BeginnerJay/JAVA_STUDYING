package chapter13;

interface Output {
    default void print() {
        System.out.println("출력한다.");
    }
}
