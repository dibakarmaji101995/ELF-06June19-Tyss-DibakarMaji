package com.tyss.corejava.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
