package chapter4;
/*
 * switch문의 최대 약점은 범위나 실수를 비교할 수 없다는 점이다.
 * 실수는 상등 비교가 부정확하고 범위를 비교해야 하므로 
 * if else문을 사용하는 것이 바람직하다.
 */
public class RangeIf {
	public static void main(String[] args) {

        double richter = 6.5;

        if (richter < 3.5) {
            System.out.println("느낄 수 없거나 피해가 거의 없음");
        } else if (richter < 4.8) {
            System.out.println("물건이 흔들리거나 경미한 피해를 입힌다.");
        } else if (richter < 6.1) {
            System.out.println("좁은 지역에 부실한 건물에만 피해를 입힌다.");
        } else if (richter < 7.5) {
            System.out.println("반경 160Km 영역의 건물을 파괴한다.");
        } else if (richter < 8.9) {
            System.out.println("넓은 지역에 심각한 피해를 입힌다.");
        } else {
            System.out.println("수천 Km 영역을 초토화시킨다.");
        }
   }
}
