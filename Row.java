package com.imw.model;

import java.util.ArrayList;
import java.util.List;

import com.imw.exception.CustomException;

/*
 * 
 *  This call is the representation of a row of a spreadsheet . 
 * 
 * 
 */
public class Row {
	
	private List<Cell> cells;
	private int rowNum;
	private Sheet sheet;
	private WorkBook workbook;
	
	public Row(WorkBook workbook, Sheet sheet, int rowNum) {
		this.rowNum = rowNum;
		this.workbook  = workbook;
		this.sheet = sheet;		
		cells = new ArrayList<Cell>();
	}
	
	public Cell createCell(int colIndex) {
		Cell cell = new Cell(workbook, sheet, rowNum, colIndex);
		cells.add(colIndex,cell);
		return cell;
	}
	
	public void removeCell(int colIndex) throws CustomException {
		if (colIndex >= 0 && colIndex < cells.size()) {
			Cell cell = new Cell(workbook, sheet, rowNum, colIndex);
			cells.set(colIndex,cell);
		} else {
            // Handle index out of bounds scenario
            throw new CustomException("Value not exist"); 
        }
	}
	
	public Cell getCell(int colIndex) throws CustomException {
        if (colIndex >= 0 && colIndex < cells.size()) {
            return cells.get(colIndex);
        } else {
            // Handle index out of bounds scenario
            throw new CustomException("Value not exist"); 
        }
    }
	
	public void updateCell(int colIndex, Cell cell) throws CustomException {
		if (colIndex >= 0 && colIndex < cells.size()) {
			cells.set(colIndex,cell);
		} else {
		     // Handle index out of bounds scenario
            throw new CustomException("Value not exist"); 
		}
	}
	
	public void printRowcells() {
		for(Cell cell : cells) {
			
			System.out.println(cell);
		}
	}
	
	public int getRowNum()
    {
        return rowNum;
    }
	

}
