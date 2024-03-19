package com.imw.model;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 *  This call is the representation of a workbook. 
 * 
 * 
 */
public class WorkBook {

	List<Sheet> sheets;
	private String name;
	
	public WorkBook(String name) {
		this.name = name;
		sheets = new ArrayList<Sheet>();
	}
	
	public Sheet CreateSheet(int sheetNo, String name) {
		Sheet sheet = new Sheet(this,sheetNo, name);
		sheets.add(sheetNo,sheet);
		return sheet;
	}
	
	public Sheet getSheet(int sheetNo) {
		return sheets.get(sheetNo);
	}
	
	public void removeSheet(int sheetNo) {
		sheets.remove(sheetNo);
	}
	
}
