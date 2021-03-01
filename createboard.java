
package com.company;

import java.util.Scanner;

public class createboard {

    public static char[] board = new char[10];

    public static void main(String[] args) {
        createboard game = new createboard();
        char[] board = new char[10];


        Scanner scan = new Scanner(System.in);

       // game.getBoard();
        //game.moveboard();
        //game.showBoard();
        game.checkplay();


    }

  
    public void checkplay() {
        //double random = (Math.random() % 2 + 1 );
        int random = (int) (1 + (Math.random() * 2));
        System.out.println("Enter your Choice 1 . Head 2. Tail");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (random == value) {
            System.out.println(" Player Won starts first");
        }
        else {
            System.out.println("Computer Won starts first");
        }
    }
