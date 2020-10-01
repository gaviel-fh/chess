package com.company;

public class Cell {
    private String name;
    private String color;
    private String cellValue = "   ";



    public Cell(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCellValue() {
        return cellValue;
    }

    public void setCellValue(String cellValue) {
        this.cellValue = cellValue;
    }
    @Override
    public String toString() {
        return "Cell{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
