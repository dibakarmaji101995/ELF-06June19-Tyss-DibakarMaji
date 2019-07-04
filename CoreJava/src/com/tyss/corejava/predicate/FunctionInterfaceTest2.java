package com.tyss.corejava.predicate;

import java.util.function.Function;

public class FunctionInterfaceTest2 {

	public static void main(String[] args) {
		Function<String,Integer> f = r -> r.length();

		Integer result = f.apply("dibakar");

		System.out.println(result);
	}

}
