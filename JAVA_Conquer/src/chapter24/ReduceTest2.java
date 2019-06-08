package chapter24;

import java.util.Optional;

public class ReduceTest2 {
	public static void main(String[] args) {
		Optional<Integer> total = Data.nara.stream()
				.map(Country::getPopu)
				.reduce(Integer::sum);
		System.out.println(total.get());
	}

}
