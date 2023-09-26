package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties pro;
	public Configuration_Reader() throws IOException {

		File f=new File("C:\\Users\\MANI MADDY\\eclipse-workspace\\AdactHotel\\src\\test\\java\\org\\helper\\adact.properties");
		
		FileInputStream fi=new FileInputStream(f);
		
		 pro=new Properties();
		
		pro.load(fi);
	}	
	public String getUrl() {

		String url = pro.getProperty("url");
		return url;
		
	}
	
	
	
	
	
	
}
