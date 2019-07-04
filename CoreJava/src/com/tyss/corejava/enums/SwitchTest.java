package com.tyss.corejava.enums;

import java.util.logging.Logger;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class SwitchTest {
	private static final Logger logger=Logger.getLogger("MyLogger");
     public static void main(String[] args) {
		String s="Apple";
		switch(s) {
		case "Apple":logger.info("Hi Apple");
		break;
		case "Cat":logger.info("Hi cat");
		break;
		default : logger.info("Sorry wrong input");
		break;
		}
	}
}
