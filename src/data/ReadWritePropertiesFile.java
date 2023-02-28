package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		//Java Class InputStream
		FileInputStream f = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		System.out.println(prop.getProperty("browser"));
		
		//or another way
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("testing", "Automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("C:\\QA\\Testing\\prop.properties");
		prop.store(fo, "Adding to properties file");
	}

}
