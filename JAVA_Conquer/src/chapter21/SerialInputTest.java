package chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialInputTest {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("pride.car"));
            chapter21.Car loadedCar = (chapter21.Car)objectInputStream.readObject();
            loadedCar.outInfo();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
