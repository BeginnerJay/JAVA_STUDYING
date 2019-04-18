package chapter10;
// 복잡한 객체나 배열을 정적으로 초기화시키기
class Bus {
    static Station[] arInfo;
    final static int BASIC_FARE = 500;
    // 정거장 정보는 버스마다 다르지 않고 모든 버스에 똑같이 적용된다.
    // static을 빼고 코딩해도 돌아가기는 한다. 하지만 똑같은 정보를 매번 생성해 엄청난 낭비가 발생한다.
    static {
        arInfo = new Station[7];
        arInfo[0] = new Station("경희대학교", 0, 0);
        arInfo[1] = new Station("청량리", 4, 200);
        arInfo[2] = new Station("제기동", 7,100);
        arInfo[3] = new Station("답십리", 12,200);
        arInfo[4] = new Station("금호동", 16,200);
        arInfo[5] = new Station("옥수", 18, 150);
        arInfo[6] = new Station("압구정", 23, 300);
    }
    void printFare(int from, int to) {
        int fare = BASIC_FARE;
        for (int i = from; i <= to; i++) {
            fare = fare + arInfo[i].getFare();
        }
        System.out.printf("%s ~ %s 까지의 요금은 %d원입니다.\n", arInfo[from].getName(), arInfo[to].getName(), fare);
    }

}
