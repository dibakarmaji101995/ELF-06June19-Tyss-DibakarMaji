package com.tys.myjavaapp.createfiletest;

import com.tyss.filecreationutils.util.CreateFileUtil;

public class CreateFile {

	public static void main(String[] args) {
		 CreateFileUtil util=new CreateFileUtil();
		 util.createFile("myFirstFile.txt","new file");
	}

}
