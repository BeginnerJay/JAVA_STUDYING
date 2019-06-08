package chapter24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Files.lines는 텍스트 파일의 각 줄을 읽어 문자열 스트림을 생성한다.
// Files.list는 지정한 경로의 파일 목록을 스트림으로 생성한다.
public class FileStream {
    public static void main(String[] args)  throws IOException {
        Stream<String> lines = Files.lines(Paths.get(
                "주저하는 연인들을 위해_UTF8.txt"));
        lines.forEach(System.out::println);
        lines.close();

        Stream<Path> list = Files.list(Paths.get("c:/"));
        list.forEach(p -> System.out.println(p.getFileName()));
        list.close();
    }
}
// 파일의 데이터를 관리하거나 파일 목록을 관리할 때에는 이 방법으로 스트림을 얻는다.