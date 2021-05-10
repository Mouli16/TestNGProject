package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          Properties prop = new Properties();
          FileInputStream fis = new FileInputStream ("C:\\Users\\Mouli Sarkar\\eclipse-workspace\\TestNGProject\\src\\data.properties");
          prop.load(fis);
          System.out.println(prop.getProperty("browser","url"));
          System.out.println(prop.setProperty("browser","chrome"));
          FileOutputStream fos = new FileOutputStream ("C:\\Users\\Mouli Sarkar\\eclipse-workspace\\TestNGProject\\src\\data.properties");
          prop.store(fos, null);
	}

}
