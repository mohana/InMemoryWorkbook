package com.imw.model;
/*
 *
	This class is the representation of a cell in a row of a spreadsheet
	
 */
public class Cell implements BaseCell{
	
	private String font;
	private int fontSize;
	private String color;
	private int height;
	private int width;
	private String value;	
	private int rowNum;
	private Sheet sheet;
	private WorkBook workbook;
	private int colindex;
	
	public Cell(WorkBook workbook, Sheet sheet, int rowNum, int colIndex) {
		this.rowNum = rowNum;
		this.workbook  = workbook;
		this.sheet = sheet;		
		this.colindex = colIndex;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
		
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getColumnIndex() {
		return this.colindex;
	}

	@Override
	public int getRowIndex() {
		return this.rowNum;
	}

	@Override
	public Sheet getSheet() {
		return this.sheet;
	}

	@Override
	public Row getRow() {
		int rowIndex = getRowIndex();
		return this.sheet.getRow(rowIndex);
	}
	
	@Override
	public String toString() {
		return "color : " + color + " Value : " + value + " RowIndex : " +rowNum +" ColIndex :" + colindex;
		
	}
}

