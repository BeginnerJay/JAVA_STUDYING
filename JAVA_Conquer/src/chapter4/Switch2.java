package chapter4;

public class Switch2 {
	public static void main(String[] args) {

        int ranking = 2;

        switch (ranking) {
        case 1:
            System.out.println("축하합니다. 금메달이에요.");
            break;
        case 2:
            System.out.println("은메달을 수여합니다.");
            break;
        case 3:
            System.out.println("동메달입니다.");
            break;
        default:
            System.out.println("참가상을 드립니다.");
            break;
        }
	}
}
/*case문내에는 여러 개의 명령을 작성할 수 있어 
 * { } 블록을 감싸지 않아도 상관없다. 
 * 대신 case문의 끝에 break문을 두어 switch문을 탈출한다. 
 * switch문은 변수의 값 하나에 대한 명령을 선택 처리하기 때문에 
 * case를 처리한 후에 즉시 break하여 빠져 나오는 것이 보편적이다.
 *  은메달이 결정되었으면 아래쪽 case는 더 볼 필요 없다.
 */