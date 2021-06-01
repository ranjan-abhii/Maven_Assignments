import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class json_file {
	
	public static void main(String args[]) {
	     
	      JSONObject jsonObject = new JSONObject();
	     
	      jsonObject.put(" ID ", " 1 \n");
	      jsonObject.put(" First_Name ", " Anirudh ");
	      jsonObject.put(" Last_Name ", " Dhawan ");
	      jsonObject.put(" Date_Of_Birth ", " 2001-12-05 ");
	      jsonObject.put(" Place_Of_Birth ", " Delhi ");
	      jsonObject.put(" Country ", " India ");
	      
	      try {
	         FileWriter file = new FileWriter("Output.json");
	         file.write(jsonObject.toJSONString());
	         file.close();
	      } catch (IOException e) {
	        
	         e.printStackTrace();
	      }
	      System.out.println("JSON file created: "+jsonObject);
	   }
}
