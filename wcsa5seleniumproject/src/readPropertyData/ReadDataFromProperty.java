package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
	//read the data from config.property file
     FileInputStream fis = new FileInputStream("./data/config.properties");
     
     //create object of property class
     Properties prop = new Properties();
     
     //make a file ready to read
     prop.load(fis);
     
     //read the particular property file
     String data = prop.getProperty("url");
     System.out.println(data);
	}

}
