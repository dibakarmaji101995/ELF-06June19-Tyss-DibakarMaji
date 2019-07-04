package com.tyss.assessment.counttypeofobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class CountTypeOfObjectPresentInArrayListTest {
	public static final Logger logger = Logger.getLogger("MyLogger");
	public static void main(String[] args) {
/*		List<Object> arrayList = null;
		// create ArrayList Object
		arrayList = new ArrayList<Object>();
		// add value to ArrayList object
		arrayList.add(10);
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(7.0);
		arrayList.add(6.0f);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		//count type of objects present in ArrayList
		logger.info(CountTypeOfObjectPresentInArrayList.countTypeOfObject(arrayList).toString());     */
		
		List<Animal> arrayList = null;
		// create ArrayList Object
		arrayList = new ArrayList<Animal>();
		//create cow and dog object
		Cow cow=new Cow();
		Dog dog=new Dog();
		// add value to ArrayList object
		arrayList.add(cow);
		arrayList.add(dog);
		
		arrayList.add(cow);
		arrayList.add(dog);
		
		arrayList.add(cow);
		arrayList.add(dog);
		
		arrayList.add(cow);
		arrayList.add(dog);
		
		//count each animal objects occurence 
		Map<String,Object> map=CountTypeOfObjectPresentInArrayList.countAnimalObjectOccurence(arrayList);
		Set<String> keySet=map.keySet();
		for(String key:keySet) {
			logger.info(key+" "+map.get(key).toString());
		}
	}

}
