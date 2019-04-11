package chapter6;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 15000);

		Bus bus100 = new Bus(100); // 노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100); // James 가 100번 버스를 탐
		studentJames.showInfo(); // James 정보 출력
		bus100.showInfo(); // 버스 정보 출력

		Subway subwayGreen = new Subway("2호선"); // 2호선 지하철 생성
		studentTomas.takeSubway(subwayGreen); // Tomas가 2호선을 탐
		studentTomas.showInfo(); // Tomas 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력

		Taxi taxi2955 = new Taxi(2955);
		studentEdward.takeTaxi(taxi2955);
		studentEdward.showInfo();
		taxi2955.showInfo();
	}
}
// 필요한 객체 선언
// 객체에 필요한 멤버 변수 선언, 생성자 정의, 메서드 선언
// 협력 기능 구현