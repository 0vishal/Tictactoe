
package com.company;

import java.util.Scanner;

public class createboard {

    public static char[] board;

    public static void main(String[] args) {
        createboard game = new createboard();
        char[] board = new char[10];

        game.getBoard();
        game.showBoard();
        System.out.println("Enter the symbol X or 0");
        Scanner scan = new Scanner(System.in);
        char player = scan.next().charAt(0);
        game.inputboard(player);

        System.out.println("player " + player);
    }

    public int inputboard(int player) {
        char computer;
        if (player == 'X') {
            computer = 'O';
        } else {
            computer = 'X';
        }
        System.out.println("Computer " + computer);

        return computer;

    }

    public static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static char[] getBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        return board;
    }
}

package com.company;

import java.util.Scanner;

public class createboard {

    public static char[] board;

    public static void main(String[] args) {
        createboard game = new createboard();
        char[] board = new char[10];

        game.getBoard();
        game.showBoard();
        System.out.println("Enter the symbol X or 0");
        Scanner scan = new Scanner(System.in);
        char player = scan.next().charAt(0);
        game.inputboard(player);

        System.out.println("player " + player);
    }

    public int inputboard(int player) {
        char computer;
        if (player == 'X') {
            computer = 'O';
        } else {
            computer = 'X';
        }
        System.out.println("Computer " + computer);

        return computer;

    }

    public static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static char[] getBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        return board;
    }
}
