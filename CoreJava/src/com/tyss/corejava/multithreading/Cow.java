package com.tyss.corejava.multithreading;

import java.util.logging.Logger;

public class Cow {
	private static final Logger logger=Logger.getLogger("MyThreadLogger");
	
    public synchronized void eat(Thread t) {
    	for (Integer i = 0; i < 10; ++i) {
			logger.info(t.getName()+"--->"+i.toString());
			try {
			//	Thread.sleep(2000);
				wait();
			} catch (InterruptedException e) {
				logger.info(e.getMessage());
			}
		}
    }
    synchronized void toDo() {
    	notifyAll();
    }
}
