package chapter19;

class NetAccess {
    public void open() { System.out.println("접속");	 }
    public void send() { System.out.println("전송");	 }
    public void close() { System.out.println("해제"); }
}

public class AutoClose {
    public static void main(String[] args) {
        NetAccess na = new NetAccess();
        try {
            na.open();
            na.send();
        }
        finally {
            na.close();
        }
    }
}
