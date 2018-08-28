package Utility;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import java.io.FileOutputStream;
import java.sql.RowIdLifetime;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

	private static XSSFSheet ExcelWSheet;
	private static HSSFSheet ExcelWSheetH;
	private static XSSFWorkbook ExcelWBook;
	private static HSSFWorkbook ExcelWBookH;
	private static XSSFCell cell;
	private static HSSFCell HCell;
	private static HSSFWorkbook excelObject;
	//HSSF is the POI Project's pure Java implementation of the Excel '97 file format. XSSF is the POI Project's pure Java implementation of the Excel 2007 OOXML (.xlsx) file format.
	private static XSSFRow row;
	private static HSSFRow HRow;
	private static String extension;


//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public static void setExcelFile() throws Exception {
	try {

			// Open the Excel file
		String path="C:\\workspace\\CucumberAdvance\\DataProvider.xlsx";
		FileInputStream ExcelFile = new FileInputStream(path);
		extension = path.substring(path.lastIndexOf("."));
		if (extension.equals(".xlsx"))
				{
				// Access the required workbook
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				// Access the required test data sheet
			
				ExcelWSheet = ExcelWBook.getSheet("Data1");
				}
		else
			{ExcelWBookH = new HSSFWorkbook(ExcelFile);
			// Access the required test data sheet
			ExcelWSheetH = ExcelWBookH.getSheet("Data1");
				
			}
		} 
		catch (Exception e){
			System.out.println("File creation"+e.getMessage());
			throw (e);
		}

}

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num


public static int[][] getNumberData() throws Exception{
int CellData[][];
	try{
		if (extension.equals(".xlsx"))
			{
			int rowCount=ExcelWSheet.getPhysicalNumberOfRows();
			CellData=new int[rowCount][2];
			for(int i=1;i<rowCount;i++)
	         {
				 CellData[i-1][0] =(int)( ExcelWSheet.getRow(i).getCell(0).getNumericCellValue());

				 CellData[i-1][1] =(int)( ExcelWSheet.getRow(i).getCell(1).getNumericCellValue());
				
	         }
			return CellData;
			}
		else
		{
			int rowCount=ExcelWSheetH.getPhysicalNumberOfRows();
			CellData=new int[rowCount][2];
			for(int i=1;i<rowCount;i++)
        {
				 CellData[i-1][0] =(int)( ExcelWSheetH.getRow(i).getCell(0).getNumericCellValue());
				 CellData[i-1][1] =(int)( ExcelWSheetH.getRow(i).getCell(1).getNumericCellValue());
					
        }
			return CellData;
		}
	}
		catch (Exception e){	System.out.println("File reading"+e.getMessage());
		CellData=new int[0][0];
		return 	 CellData;
	
			}
	
	
}

public static int[] getMultiplicationData() throws Exception{
int CellData[];
	try{
		if (extension.equals(".xlsx"))
			{
			int rowCount=ExcelWSheet.getPhysicalNumberOfRows();
			CellData=new int[rowCount];
			for(int i=1;i<rowCount;i++)
	         {
				 CellData[i-1] =(int)( ExcelWSheet.getRow(i).getCell(2).getNumericCellValue());

				 
	         }
			return CellData;
			}
		else
		{
			int rowCount=ExcelWSheetH.getPhysicalNumberOfRows();
			CellData=new int[rowCount];
			for(int i=1;i<rowCount;i++)
        {
				 CellData[i-1]=(int)( ExcelWSheetH.getRow(i).getCell(2).getNumericCellValue());
				 		
        }
			return CellData;
		}
	}
		catch (Exception e){	System.out.println("File reading"+e.getMessage());
		CellData=new int[0];
		return 	 CellData;
	
			}
	
	
}
//This method is to write in the Excel cell, Row num and Col num are the parameters

public static void setCellData(String Result,  int RowNum) throws Exception	{

		try{
			FileOutputStream fileOut = new FileOutputStream("C:\\workspace\\CucumberAdvance\\DataProvider.xlsx");
			if (extension.equals(".xlsx"))
			{
			row=ExcelWSheet.getRow(RowNum);
			cell = row.getCell(4);
		
		if (cell == null) {

			cell = row.createCell(4);

			cell.setCellValue(Result);
		
			} else {

				cell.setCellValue(Result);
				
			}
			

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();
			}
			else
			{
				HRow  = ExcelWSheetH.getRow(RowNum);
				System.out.println("cell accessed");
			HCell = HRow.getCell(4);

			if (HCell == null) {

				HCell = HRow.createCell(4);

				HCell.setCellValue(Result);
				
				} else {

					HCell.setCellValue(Result);
					

				}
			
					ExcelWBookH.write(fileOut);

					fileOut.flush();

					fileOut.close();
			}
			}catch(Exception e){
				System.out.println("File writing"+e.getMessage());
				throw (e);
			}
		}
		

}