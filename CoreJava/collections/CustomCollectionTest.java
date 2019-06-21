 package com.tyss.corejava.collections;

import java.util.logging.Logger;

public class CustomCollectionTest {
	private static final Logger logger=Logger.getLogger("CustomCollectionTest");
	public static void main(String[] args) {
		Long startTime=System.currentTimeMillis();
		CustomCollection cc=null;
        //create CustomeCollection object
		cc=new CustomCollection();
		cc.add(1);
		cc.add(2);
		cc.add(3);
		cc.add(4);
		cc.add(5);
		cc.add(6);
		cc.add(7);
		cc.add(8);
		cc.add(9);
		cc.add(10);
		cc.add(11);
		
		logger.info(cc.get(1).toString());
		logger.info(cc.toString()); 
		cc.remove(10);
		logger.info(cc.toString());
		Long endTime=System.currentTimeMillis();
		Long exeTime=endTime-startTime;
		 logger.info(exeTime.toString()+" ms");
		 logger.info("Number of elements::"+cc.getSize());
		
	}
}
