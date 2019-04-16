package chapter7

// 7.3.4 명령행 인수
// 콘솔 프로그램은 명령행을 통해 작업 대상이나 옵션을 입력받는다. java program의 명령행 인수는 main method의 인수로 전달됨.
// publuc static void main(String[] args) 에서 String[] 타입의 args가 바로 명령행 인수이다.
// 키보드로부터 임의의 문자가 입력될 수 있어 범용적인 문자열이 적합하며, 옵션의 개수에 제한이 없다.
object Args {
    @JvmStatic
    fun main(args: Array<String>) {
        var sum = 0
        for (i in args.indices) {
            sum += Integer.parseInt(args[i])
        }
        println("총 합계 = $sum")
    }
}
