package com.tyss.corejava.predicate;

import java.util.function.Function;

public class FunctionInterfaceTest3 {

	public static void main(String[] args) {
		Function<Integer,Integer> f = r -> r*r;

		Integer result = f.apply(6);

		System.out.println(result);
	}

}
