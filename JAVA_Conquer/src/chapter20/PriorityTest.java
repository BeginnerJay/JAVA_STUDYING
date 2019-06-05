package chapter20;

public class PriorityTest {
    public static void main(String[] args) {
        PrintSinTherad workerSin = new PrintSinTherad();
        PrintCosThread workerCos = new PrintCosThread();
        workerSin.start();
        workerCos.setPriority(Thread.MAX_PRIORITY);
        workerCos.start();
    }
}
// 우선순위 할당은 요청일 뿐, 들어줄지 말지는 시스템이 결정한다.