package chapter21;

import java.io.*;

/*
ObjectSTream은 객체를 스트림으로 입출력한다.
ObjectOutput(Input)Stream(Output(Input)Stream out(in))

writeObject <- 객체의 모든 인스턴스 멤버를 스트림으로 출력
readObject <- 스트림으로부터 멤버값을 읽어 객체 생성

직렬화 <- 메모리에 입체적으로 저장된 객체를, 일차원적인 스트림으로 만드는 것
역직렬화 <- 일차원의 스트림을 다시 입체적인 객체로 조립하는 것.

직렬화 가능 클래스 만들기 <- Serializable 인터페이스를 상속받기만 하면 된다.
이 인터페이스 자체는 아무런 기능이 없으며, 직렬화 가능한 타입이라는 것을 알리기만 한다.
 */

public class SerialOutputTest {
    public static void main(String[] args) {
        chapter21.Car pride = new chapter21.Car("프라이드", "파랑", true);
        // 파일로 출력
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("pride.car"));
            objectOutputStream.writeObject(pride);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                System.out.println("객체를 스트림으로 기록");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
