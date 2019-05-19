package chapter12;

public class HashTest {
    public static void main(String[] args) throws Exception {
        FileHash fileHash = new FileHash("school.jpg");
        fileHash.genHash();
        fileHash.displayHash();

    }
}
