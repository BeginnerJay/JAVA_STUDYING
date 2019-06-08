package chapter24;

import java.util.Optional;

public class ReduceMinMax {
	public static void main(String[] args) {
		Optional<Integer> min = Data.nara.stream()
			.map(Country::getPopu)
			.reduce(Integer::min);
		System.out.println(min.get());
		Optional<Integer> max = Data.nara.stream()
			.map(Country::getPopu)
			.reduce(Integer::max);
		System.out.println(max.get());
	}

}
