package com.unni.practicelession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReadingAndFiltering {
	public static Properties prop;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		    prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\unni.krishnan\\Desktop\\titles.csv");
			prop.load(ip);
			//System.out.println("Titles are ",prop.load(ip));

	}

}