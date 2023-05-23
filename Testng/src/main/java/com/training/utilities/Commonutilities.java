package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Commonutilities {
	
	public String getProperty(String key) throws IOException {
		String path="C:\\Users\\schou\\eclipse-workspace\\Testng\\property\\application.properties";
       FileInputStream fileinput=new FileInputStream(path);
       
       Properties prop= new Properties();
        prop.load(fileinput);
       String value=  prop.getProperty(key);
       return value;
}
}