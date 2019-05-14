package chapter13;

interface Print {
    default void print() {
        System.out.println("인쇄한다");
    }
}
