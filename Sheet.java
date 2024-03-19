package com.imw.model;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 *  This call is the representation of a worksheet. 
 * 
 * 
 */
public class Sheet {
	
private int sheetNo;
private String name;
private WorkBook workbook;

private Map<Integer, Row> rows;

public Sheet(WorkBook workbook, int sheetNo, String name) {
	this.name = name;
	this.workbook = workbook;
	this.sheetNo = sheetNo;
	this.rows = new HashMap<Integer, Row>();
}

public int getSheetNo() {
	return sheetNo;
}

public void setSheetNo(int sheetNo) {
	this.sheetNo = sheetNo;
}

public Row createRow(int rowNum) {
	Row row = new Row(workbook,this,rowNum);
	rows.put(Integer.valueOf(rowNum), row);
	return row;
}

public void removeRow(int rowNum) {
	Row row = rows.get((Integer.valueOf(rowNum)));
	rows.remove(row);	
}

public Row getRow(int rowNum) {
	return rows.get(Integer.valueOf(rowNum));
}


}
