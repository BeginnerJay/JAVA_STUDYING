package lecture0507;
public class testC implements testA, testB {
	public void print() {
		testA.super.print();
		testB.super.print();
	}

}
