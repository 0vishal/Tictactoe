package com.company;

import java.util.Scanner;

public class createboard {

    public static char[] board = new char[10];

    public static void main(String[] args) {
        createboard game = new createboard();
        char[] board = new char[10];


        Scanner scan = new Scanner(System.in);

     
        game.moveboard();
      
    }

    public static void moveboard() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position you want to put X or 0");
        int position = sc.nextInt();
        System.out.println("Enter the input X or 0");
        char value = sc.next().charAt(0);
        for (int i = 1; i < 10; i++) {
            if (i == position && board[i] == ' ') {
                board[i] = value;
                break;
            }
            else {
                System.out.println("incorrect");
            }
        }
    }
