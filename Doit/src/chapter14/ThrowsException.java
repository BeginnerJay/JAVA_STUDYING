package chapter14;
// 예외를 해당 메서드에서 처리하지 않고, 메서드를 호출해 사용하는 부분에서 처리하는 throws 쓰기

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    // Class 클래스는, 자바에서 사용되는 클래스들에 대한 구조를 가지고 있는 class이다.
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName); // FileNotFoundException 발생 가능
        Class c = Class.forName(className); // ClassNotFoundException 발생 가능
        return c;
    }

    public static void main(String[] args) {
        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("a.txt","java.lang.String");
        }
        /*
        catch(FoleNotFoundException | ClassNotFoundException e) 라고 할 수도 있다.
        여러 개의 예외를 하나의 catch문에서 처리하겠다는 의미이다.
         */
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace(); // Exception 클래스로 그외의 예외 처리(catch문 불록중 가장 밑에 놓을 것!)
        }
        // add exceptions to method signature 쓰면, 예외가 JVM으로 보내져서 프로그램 뻗는다! trycatch 해주자.
        // 메서드를 호출할 때 예외를 처리함.
    }
}
