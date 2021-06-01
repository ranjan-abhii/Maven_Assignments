package properties_assignment;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class properties {
	
		public static void main(String [] args) throws Exception
		{
			Properties p = new Properties();
			OutputStream os = new FileOutputStream("config2.properties");
			
			p.setProperty("name", "Arnav");
			p.setProperty("id", "64");
			
			p.store(os, null);
			
		}
		
		

	

}
