import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class POITest {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("ExcelTestData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheetCount = workbook.getNumberOfSheets();

        System.out.println(sheetCount);

        for(int i=0;i<sheetCount;i++) {

            if (workbook.getSheetName(i).equalsIgnoreCase("SheetA")) {

                XSSFSheet sheet = workbook.getSheetAt(i);

                Iterator<Row> rows = sheet.iterator();

                Row firstRow = rows.next();

                Iterator<Cell> cells = firstRow.iterator();

                int c = 0;

                int columnpostion = 0;

                while (cells.hasNext()) {

                    Cell cell = cells.next();

                    if (cell.getStringCellValue().equalsIgnoreCase("Tests")) {

                        columnpostion = c;

                    }

                    c++;

                }

                while (rows.hasNext()) {

                    Row row = rows.next();

                    Cell cell = row.getCell(columnpostion);

                    if (cell.getStringCellValue().equalsIgnoreCase("Login")) {

                        for (Cell value : row) {

                            System.out.println(value.getStringCellValue());

                        }

                    }

                }
            }
        }
        workbook.close();
    }
}
