package chapter12;
// instanceof는 좌변의 객체가 우변의 타입이 맞는지를 조사하여, return boolean
// 객체의 정적인 선언 타입을 보는 것이 아니라 실제 가리키고 있는 타입을 점검하여, 객체가 우변 타입이면 return true
public class Instanceof2 {
    static void testAnimal(Animal animal) {
        animal.move();
        if (animal instanceof Dog) {
            Dog mydog = (Dog)animal;
            mydog.bark();
        }
        if (animal instanceof Dove) {
            Dove mydove = (Dove)animal;
            mydove.fly();
        }
    }

    public static void main(String[] args) {
        Dog baechu = new Dog();
        testAnimal(baechu);
        Dove googoo = new Dove();
        testAnimal(googoo);
    }
}
