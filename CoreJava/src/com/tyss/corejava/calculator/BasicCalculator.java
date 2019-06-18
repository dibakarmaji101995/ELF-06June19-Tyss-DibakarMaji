/*
 * 
 */
package com.tyss.corejava.calculator;

/**
 * 
 * @author Administrator
 *
 */
public class BasicCalculator {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Integer add(Integer num1, Integer num2) {
		return num1 + num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Integer sub(Integer num1, Integer num2) {
		return num1 - num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Integer mul(Integer num1, Integer num2) {
		return num1 * num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Float div(Integer num1, Integer num2) {
		return (float) num1 / num2;
	}
}
