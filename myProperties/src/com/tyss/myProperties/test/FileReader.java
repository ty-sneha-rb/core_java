package com.tyss.myProperties.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

	public static void main(String[] args) throws IOException {
		FileInputStream inStream= new FileInputStream("my.properties");
		
Properties pro = new Properties();
pro.load(inStream);
String name = (String) pro.get("name");
String salary = (String) pro.get("salary");
System.out.println(name + salary);

	}

}
