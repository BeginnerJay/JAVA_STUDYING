package chapter6;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;

	public Taxi(int taxiNumber) { // constructor
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) { // method
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.printf("택시 %d번의 승객은 %d명이고, 수입은 %d입니다.", taxiNumber, passengerCount, money);
	}
}
