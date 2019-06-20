package com.tyss.corejava.array;

interface Squere{
	int squ(int a);
}
public class TestFunctionalInterface3 {
	

	public static void main(String[] args) {
		Squere f=  a -> {
			  
			  for(int i=1;i<2;++i) {
				  a=a*a; 
			  }
			return a;
		};
		int squ=f.squ(5);
		System.out.println("Squere::"+squ);
	}


}

