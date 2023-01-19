package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadNumericDataFromExcel {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue());
		wb.close();
}

}

//This will give double value in output to get exactly the exactly same number in output then we use DataFormatter.
