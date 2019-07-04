package com.tyss.uinttest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOpeMultipleValue {
	private String name;
	private Integer value;
	private StringOpertaion strOperation = new StringOpertaion();

	public StringOpeMultipleValue(String name, Integer value) {
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "apple", 5 },
				           { "raju", 4 },
				           { "raj", 7 } };
		return Arrays.asList(obj);
	}

	@Test
     public void StringOpeTest() {
    	 Integer actual=strOperation.count(name);
    	 assertEquals(value,actual);
     }
}
