package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("writer.txt")){
            fileWriter.write('A');
            char buf[] = {'B', 'C', 'D', 'E', 'F'};

            fileWriter.write(buf); // 문자 배열 출력
            fileWriter.write("안녕하세요. 잘 써지네요"); // 문자열 출력
            fileWriter.write(buf, 1, 2); // 문자 배열의 일부 출력
            fileWriter.write("65"); // 숫자를 그대로 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
