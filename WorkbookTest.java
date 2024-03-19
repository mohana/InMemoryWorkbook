package com.imw;

import com.imw.exception.CustomException;
import com.imw.model.Cell;
import com.imw.model.Row;
import com.imw.model.Sheet;
import com.imw.model.WorkBook;

public class WorkbookTest {

	public static void main(String arg[]) throws CustomException {
		WorkBook wb = new WorkBook("Test");
		Sheet sheet = wb.CreateSheet(0, "Test Sheet1");
		Row row= sheet.createRow(1);
		Cell cell = null;
		for (int i = 0; i < 5; i++) {
           cell = row.createCell(i);
           cell.setColor("black");
           cell.setFont("Calibri");
           cell.setValue("Initial Value " + i);
           cell.setFontSize(10);
           cell.setHeight(10);
           cell.setWidth(10);
        }
		
		row.printRowcells();
		
		System.out.println("\n\n");
		
		cell = row.getCell(3);
		cell.setColor("white");
		cell.setValue("ValueChanged  " +cell.getColumnIndex());
		
		row.printRowcells();

	}
	
	
}
