package chapter6;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber; // 버스 번호를 매개변수로 받는 constructor
	}

	public void take(int money) { // 승객이 버스에 탄 경우를 구현한 메서드
		this.money += money; // 버스 수입 증가
		passengerCount++; // 승객 수 증가
	}

	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d입니다.", busNumber, passengerCount, money);
	}
}
