package chapter14;

public class IDFormatTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("ID는 null일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("ID는 8자 이상 20자 이하로 쓰세요.");
        } else {
            this.userID = userID;
        }
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        } // 아이디 값이 null인 경우

        userID = "1234567";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        } // 아이디 값이 8자 이하인 경우
    }
}