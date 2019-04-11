package chapter5;

public class Subject {
	String subjectName;
	int scorePoint;
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	/* 이클립스에서는 모든 멤버 변수에 대해 getter와 setter를 자동으로 만들 수 있는 기능을 제공한다.
	 * 이클립스 편집기 창의 멤버 변수를 선언한 클래스 내부에서, 오른쪽 마우스 클릭하고
	 * Source -> Generate Getters and Setters... 메뉴 클릭
	 * 하면 창이 뜨는데, 이 중 get(),set() 메서드를 추가하고 싶은 멤버 변수를 선택하고
	 * OK 를 누르면 해당 변수의 getter와 setter 메서드가 생성된다.
	 *
	 *
	 * */
}
