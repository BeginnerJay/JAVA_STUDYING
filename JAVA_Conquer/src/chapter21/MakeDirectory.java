package chapter21;

import java.io.File;
import java.io.FileWriter;

public class MakeDirectory {
    public static void main(String[] args) throws Exception  {
        File folder = new File("d:\\JAVA_LAB\\TestFolder");
        if (folder.mkdir()) {
            File file = new File("d:\\JAVA_LAB\\TestFolder\\MyFile.txt");
            if (file.createNewFile()) {
                FileWriter out = new FileWriter(file);
                out.write("테스트 파일");
                out.close();
            }
        }
    }
}
