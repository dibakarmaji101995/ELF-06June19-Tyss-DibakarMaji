package com.tyss.filecreationutils.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CreateFileUtil {
    
	public Boolean createFile(String fileLoc,String data) {
    	 try {
			FileUtils.writeStringToFile(new File(fileLoc),data);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
    	 return true;
     }//createFile(-)
}//class
