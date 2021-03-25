package com.tyss.myProperties.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileWriter {

	public static void main(String[] args)  throws Exception{
		FileOutputStream outputStream = new FileOutputStream("first.properties");
		Properties pro = new Properties();
		pro.setProperty("dchdj", "ffwyfd");
		pro.store(outputStream, "yrbfdj");
		System.out.println("file is created");
	}

}
