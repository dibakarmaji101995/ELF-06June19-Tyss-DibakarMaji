package com.tyss.corejava.supplier;

import java.util.function.Supplier;

public class GunTest2 {
	public static void main(String[] args) {
          Supplier<Gun> s=()-> new Gun(10);
          Gun g=s.get();
          System.out.println(g);
         
	}
}
