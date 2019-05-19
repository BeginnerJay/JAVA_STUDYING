package chapter10;
// 엑세서는 메서드 -> 섬세한 조건 점검은 물론, 능동적인 동작도 가능하다.
// 값 하나가 변경됨으로써 부차적으로 처리할 작업을 부효과라고 한다.
class Range {
    private int from, to;

    public Range(int from, int to) {
        setFrom(from); setTo(to);
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
        if (to < from) {
            to = from;
        }
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
        if (from > to) {
            from = to;
        }
    }

    public void outRange() {
        System.out.printf("%d ~ %d\n", from, to);
    }
}
// 무효한 값은 아예 무시해 버리거나, 예외를 던져 잘못된 값임을 알리는 방법도 가능하다.
// 캡슐화같은 강력한 장치가 필요한 이유는, 클래스를 만드는 사람과 쓰는 사람이 다르기 때문이다.
    // 1. 사용 편의성
        // 공개된 조작법만 알면 쓸 수 있도록 한다.
        // 사용자가 굳이 몰라도 된느 것은 가급적 숨겨야 하며, 안전에 치명적인 핵심 부분은 존재를 드러내지 않는다.
        // 여기서 사용자란 객체를 조립하는 응용 프로그램 개발자를 말한다.
    // 2. 안정성
        // 부품은 그 자체로 완벽해야. 어디서 어떤 식으로 사용하더라도 자신의 역할을 잘 수행해야 한다.
    // 3. 개선 용이성
        // 숨겨진 기능은 사용자가 애초에 알지도 못하고 쓰지도 않았으니, 자유롭게 업그레이드 할 수 있다.
        // 사용자와 직접적인 인터페이스를 이루지 않는 부분은 최대한 숨기는 것이 유리하다.