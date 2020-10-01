package com.company;

import java.util.ArrayList;

public class Board {
    ArrayList<Cell> cells = new ArrayList<>();
    StringBuffer boardString;
    int rows = 8;
    int columns = 8;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public void initialize() {
        generateCell();
    }

    private void generateCell() {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String cellName = alphabet.charAt(i) + Integer.toString(j+1);
                cells.add(new Cell(cellName, calculateColor(i, j)));
            }
        }

    }

    private String calculateColor(int row, int column) {
        String color;

        if(row % 2 == 0) {
            if(column % 2 == 0) {
                color = "white";
            } else {
                color = "black";
            }
        } else {
            if(column % 2 == 0) {
                color = "black";
            } else {
                color = "white";
            }
        }

        return color;
    }

    public String generateBoardString() {
        String rowDivider = "---+---+---+---+---+---+---+---";
        StringBuffer boardString = new StringBuffer(rowDivider + " ||\n");

        for(int i = 0; i < cells.size(); i++) {
            boardString.append(cells.get(i).getCellValue());

            if((i +1) % rows == 0 && i > 0) {
                boardString.append(" || " + (i/rows + 1) + "\n");

                if(i != (cells.size()-1)) {
                    boardString.append(rowDivider + " ||\n");
                }
            } else {
                boardString.append("|");
            }
        }

        boardString.append("===============================\n");
        boardString.append(" A   B   C   D   E   F   G   H");

        return boardString.toString();
    }

    public void printCells() {
        for(Cell cell : cells ) {
            System.out.println(cell.toString());
        }
    }
}
