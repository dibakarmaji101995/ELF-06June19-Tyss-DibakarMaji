package com.tyss.corejava.supplier;

public class GunTest {
	public static void main(String[] args) {
          Supplyer<Gun> s=()-> new Gun(10);
          Gun g=s.get();
          System.out.println(g);
         
	}
}
