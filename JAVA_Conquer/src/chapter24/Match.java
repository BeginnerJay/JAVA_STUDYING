package chapter24;
// 하나라도 있는지, 전부 만족하는지, 조건에 맞는게 하나도 없는지 점검하고 불 값 반환
public class Match {
    public static void main(String[] args) {
        System.out.println(Data.nara.stream().anyMatch(c -> c.cont == Cont.AFRICA));
        System.out.println(Data.nara.stream().allMatch(c -> c.popu > 10));
        System.out.println(Data.nara.stream().noneMatch(c -> c.popu < 8));
    }
}
