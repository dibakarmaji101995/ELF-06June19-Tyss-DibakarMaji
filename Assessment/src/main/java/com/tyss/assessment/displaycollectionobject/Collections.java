package com.tyss.assessment.displaycollectionobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {
	public static Collection getProduct(Integer option) {
		if (option.equals(1)) {
			return new ArrayList();
		} else if (option.equals(2)) {
			return new LinkedList();
		} else if (option.equals(3)) {
			return new Vector();
		} else {
			return null;
		}
	}
}
