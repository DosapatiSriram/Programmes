

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToJson {

	public ExcelToJson() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelToJson obj = new ExcelToJson();
		obj.readData();

	}
	
	public void readData(){
		String tableName;
		String typeName;
		
		FileInputStream  fileInputStreamObject;
		Scanner scannerObject = new Scanner(System.in);
		 String CurrentCellValue;
		try{
			fileInputStreamObject = new FileInputStream(new File("C:\\sample\\institional.xlsx"));
	        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	        //Create Workbook instance holding reference to .xlsx file
	        Workbook workbook = new XSSFWorkbook(fileInputStreamObject);
	        
	        int count = 0;
	        //Get first/desired sheet from the workbook
	        Sheet sheet = workbook.getSheetAt(0);
	        /*System.out.println("Enter table name:");
	        tableName = scannerObject.next();*/
	        /*System.out.println("Enter type name:");
	        typeName = scannerObject.next();*/
	        /*System.out.println("\""+tableName+"\" : {");*/
	       /* System.out.println("\""+typeName+"\" : {");*/
	        boolean firstHit = true;
	        
	        
	        
	        java.util.Iterator<Row> iterator = sheet.iterator();
	        while ( iterator.hasNext()) {
	        	count =0;
	            Row row = (Row) iterator.next();
	            int noOfColumns = row.getPhysicalNumberOfCells();
	            
	            java.util.Iterator<Cell> iterator2 = row.iterator();
	            while ( iterator2.hasNext()) {
	            	count++;
	                Cell cell = (Cell) iterator2.next();
	                cell.setCellType(Cell.CELL_TYPE_STRING);
	                CurrentCellValue = new String(cell.getStringCellValue());
	                if (count==1 && noOfColumns==2){
	                	count++;
	                }
	                if (count==1 && noOfColumns==3 && !CurrentCellValue.equals(null) && CurrentCellValue.length()>0){
	                	if(!firstHit){
	                		 System.out.println("}\n}");
	                	}
	                	System.out.println("\"mappings\" : {");
	                	System.out.print("\""+CurrentCellValue+"\":{");
	                	System.out.println("\"properties\":{");
	                }
	                if(count==2){
	                	System.out.print("\""+CurrentCellValue+"\":");
	                	
	                }else if(count==3){
	                	System.out.print("{\"type\":\""+CurrentCellValue+"\"");
	                	
	                }else if(count==4 && CurrentCellValue.length()>0){
	                	System.out.print(",\""+CurrentCellValue+"\":");
	                	
	                }else if(count==5 && CurrentCellValue.length()>0){
	                	System.out.println("\""+CurrentCellValue+"\"");
	                	
	                }
	            }
	            System.out.println("},");
	            
	            firstHit=false;
	        }
	        System.out.println("}\n}");
      
        }
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		 // fileInputStreamObject.close();	
	}

}
