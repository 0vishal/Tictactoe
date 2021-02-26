package com.company;

public class createboard {
    public static void main(String[] args) {
        createboard game = new createboard();
        game.board();
    }

    public char[] board() {

        char[] board = new char[10];
        for(int i=1; i<10;i++) {
                board[i] = ' ';
        }
        return board;
    }
}
