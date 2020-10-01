package com.company;

public class Main {

    public static void main(String[] args) {
	    Board myBoard = new Board();
        myBoard.initialize();
//	    myBoard.printCells();

        System.out.println(myBoard.generateBoardString());
    }
}
