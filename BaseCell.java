package com.imw.model;

/*
 * Representation of a cell in a row of a spreadsheet.
 */
public interface BaseCell {

	int getColumnIndex();

    int getRowIndex();

    Sheet getSheet();

    Row getRow();
     
}
