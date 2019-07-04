package com.tyss.assessment.animalsound;

import java.util.logging.Logger;

public class AnimalSoundTest {
    public static final Logger logger=Logger.getLogger("MyLogger");
	public static void main(String[] args) {
		Animal animal=null;
         //get Animal object from factory
        animal=AnimalFactory.getInstance("Cow");
        //get animal sound
        if(animal!=null) {
        logger.info(animal.sound());
        }else {
        	logger.info("Animal not found");
        }
	}

}
