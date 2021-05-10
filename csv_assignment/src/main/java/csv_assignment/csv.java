package csv_assignment;

import java.io.PrintWriter;
import java.io.File;

public class csv {

	public static void main(String[] args) {
		
		try {

			
			PrintWriter pw = new PrintWriter(new File("\\Batch_ID.csv"));
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Sr. No.");
			sb.append(",");
			sb.append("Name");
			sb.append(",");
			sb.append("Batch");
			sb.append("\r\n");
			
			sb.append("1");
			sb.append(",");
			sb.append("Abhishek");
			sb.append(",");
			sb.append("123");
			sb.append("\r\n");
			
			sb.append("2");
			sb.append(",");
			sb.append("Zack");
			sb.append(",");
			sb.append("321");
			sb.append("\r\n");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("Fiished");
		}
		catch (Exception e)
		{
			
		}
		
		
		
		
		

	}

}
