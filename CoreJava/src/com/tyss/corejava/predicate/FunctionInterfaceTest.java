package com.tyss.corejava.predicate;

import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		Function<Double, Double> f = r -> 3.142 * r * r;

		Double result = f.apply(3.0);

		System.out.println(result);
	}

}
