package com.tyss.corejava.supplier;

public class Gun {
	private Integer numGun;
    public Gun(Integer numGun) {
		this.numGun=numGun;
	}
	@Override
	public String toString() {
		return "Gun [numGun=" + numGun + "]";
	}
    
}
