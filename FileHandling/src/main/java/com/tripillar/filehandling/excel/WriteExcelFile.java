import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sample Sheet");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("ID");
        row.createCell(1).setCellValue("Name");

        Row rowData = sheet.createRow(1);
        rowData.createCell(0).setCellValue(1);
        rowData.createCell(1).setCellValue("Ravi");

        try (FileOutputStream fileOut = new FileOutputStream("data.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
