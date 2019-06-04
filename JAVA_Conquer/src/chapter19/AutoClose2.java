package chapter19;

class NetAccess2 implements AutoCloseable {
    public void open() { System.out.println("접속");	 }
    public void send() { System.out.println("전송");	 }
    public void close() { System.out.println("해제"); }
}

public class AutoClose2 {
    public static void main(String[] args) throws Exception {
        try (NetAccess2 na = new NetAccess2()) {
            na.open();
            na.send();
        }
    }
}
