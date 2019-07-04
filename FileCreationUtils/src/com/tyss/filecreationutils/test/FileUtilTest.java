package com.tyss.filecreationutils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.filecreationutils.util.CreateFileUtil;


public class FileUtilTest {
	private static final CreateFileUtil util=new CreateFileUtil();
	@Test
     public void createFileTest() {
    	 Boolean actual=util.createFile("firstFile.txt","This is junit test");
    	 assertEquals(true, actual);
     }
}
