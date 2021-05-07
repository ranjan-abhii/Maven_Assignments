package excel_assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	private static String[] columns = {"First Name", "Last Name", "Email", "Tracking Id"};
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	
	
    public static void main(String[] args) throws IOException {
    	
    	contacts.add(new Contact("A", "B", "a@gmail.com", "1"));
    	contacts.add(new Contact("AB", "BA", "ad@gmail.com", "2"));
    	contacts.add(new Contact("ABC", "CBA", "cba@gmail.com", "3"));
    	contacts.add(new Contact("ABCD", "DCBA", "dcba@gmail.com", "4"));
    	contacts.add(new Contact("ABCDE", "EDCBA", "edcba@gmail.com", "5"));
    	
    	
    	Workbook workbook = new XSSFWorkbook();
    	Sheet sheet = workbook.createSheet("Contacts");
    	
    	Font headerFont = workbook.createFont();
    	headerFont.setBold(true);
    	headerFont.setFontHeightInPoints((short) 17);
    	headerFont.setColor(IndexedColors.BLUE.getIndex());
    	
    	CellStyle headerCellStyle = workbook.createCellStyle();
    	headerCellStyle.setFont(headerFont);
    	
    	Row headerRow = sheet.createRow(0);
    	
    	for(int i = 0; i < columns.length; i++)
    	{
    		Cell cell = headerRow.createCell(i);
    		cell.setCellValue(columns[i]);
    		cell.setCellStyle(headerCellStyle);	
    	}
    	
    	int rowNum = 1;
    	
    	for(Contact contact : contacts)
    	{
    		Row row = sheet.createRow(rowNum++);
    		row.createCell(0).setCellValue(contact.firstName);
    		row.createCell(1).setCellValue(contact.lastName);
    		row.createCell(2).setCellValue(contact.email);
    		row.createCell(3).setCellValue(contact.trackingId);
    		
    	}
     	
    	for(int i = 0; i < columns.length; i++)
    	{
    		sheet.autoSizeColumn(i);
    	}
    	
    	FileOutputStream fileOut = new FileOutputStream("contacts.xlsx");
    	workbook.write(fileOut);
    	fileOut.close();
    	workbook.close();
    	
    }	
}
