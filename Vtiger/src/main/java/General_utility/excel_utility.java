package General_utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_utility {
	/**
	 * this method is used to fetch data from excel
	 * @param sheetname
	 * @param rowname
	 * @param cellname
	 * @return
	 * @throws Throwable
	 * @author SUMIT
	 */
	public String getexcelsheet(String sheetname,int rowname,int cellname) throws Throwable {
		FileInputStream fip=new FileInputStream("./src/test/resources/Excelfeb.xlsx");
        Workbook wb=WorkbookFactory.create(fip);
       /* Sheet sheet = wb.getSheet(sheetname);
        Row row = sheet.getRow(rowname);
        Cell cell = row.getCell(cellname);
        String productname = cell.getStringCellValue();
		return productname;*/
        DataFormatter df=new DataFormatter();
       String data = df.formatCellValue(wb.getSheet(sheetname).getRow(rowname).getCell(cellname));
       return data;
	}
	public Object[][] readdata(String sheetname) throws Throwable{
		FileInputStream fis=new FileInputStream("src/test/resources/Excelfeb.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(sheetname);
		int lastrow=sheet.getLastRowNum()+1;
		int lastcell=sheet.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++) {
			for(int j=0;j<lastcell;j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}

}
