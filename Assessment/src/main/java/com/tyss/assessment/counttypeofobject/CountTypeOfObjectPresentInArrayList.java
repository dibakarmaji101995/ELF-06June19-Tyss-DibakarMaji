package com.tyss.assessment.counttypeofobject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTypeOfObjectPresentInArrayList {
	public static Integer countTypeOfObject(List<Object> list) {
		Integer count = 0;
		Integer intFirstOcuurence = 1;
		Integer doubleFirstOcuurence = 1;
		Integer floatFirstOcuurence = 1;
		for (Integer i = 0; i < list.size(); ++i) {
			Object obj = list.get(i);
			if (obj != null) {
				if (obj instanceof Integer && intFirstOcuurence.equals(1)) {
					count++;
					intFirstOcuurence++;
				}
				if (obj instanceof Double && doubleFirstOcuurence.equals(1)) {
					count++;
					doubleFirstOcuurence++;
				}
				if (obj instanceof Float && floatFirstOcuurence.equals(1)) {
					count++;
					floatFirstOcuurence++;
				}
			}
		}
		return count;
	}

	public static Map<String,Object> countAnimalObjectOccurence(List<Animal> list) {
		Integer count = 0;
		Map<String, Object> map = null;
		// create map object
		map = new HashMap<String, Object>();
		for (Integer i = 0; i < list.size(); ++i) {
			if (map.containsKey(list.get(i).toString())) {
				Integer in=(Integer) map.get(list.get(i).toString());
				map.put(list.get(i).toString(), in+1);
			} else {
				map.put(list.get(i).toString(), 1);
			}
		}
		return map;
	}
}
