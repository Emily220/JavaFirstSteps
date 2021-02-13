package com.github.epietras220.tic.tac.toe;

import java.util.Scanner;

public class TicTacToe {
    private static String[] table = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    private static Scanner input = new Scanner(System.in);
    private static boolean moveUser = false;


    private static boolean checkResult() {
        if ((table[0].equals(table[1]) && table[0].equals(table[2]) && table[1].equals(table[2]) && !table[2].equals(" ")) ||
                (table[3].equals(table[4]) && table[3].equals(table[5]) && table[4].equals(table[5]) && !table[5].equals(" ")) ||
                (table[6].equals(table[7]) && table[6].equals(table[8]) && table[7].equals(table[8]) && !table[8].equals(" ")) ||
                (table[0].equals(table[3]) && table[0].equals(table[6]) && table[3].equals(table[6]) && !table[6].equals(" ")) ||
                (table[1].equals(table[4]) && table[1].equals(table[7]) && table[4].equals(table[7]) && !table[7].equals(" ")) ||
                (table[2].equals(table[5]) && table[2].equals(table[8]) && table[5].equals(table[8]) && !table[8].equals(" ")) ||
                (table[0].equals(table[4]) && table[0].equals(table[8]) && table[4].equals(table[8]) && !table[8].equals(" ")) ||
                (table[2].equals(table[4]) && table[2].equals(table[6]) && table[4].equals(table[6]) && !table[6].equals(" "))) {
            if (moveUser){
                System.out.println("uzytkownik 1 - 'kolko' wygrał");
            }
            else{
                System.out.println("uzytkownik 2 - 'krzyzyk' wygrał");
            }
            return true;
        }
        if(!table[0].equals(" ") && !table[1].equals(" ") &&!table[2].equals(" ") &&
                !table[3].equals(" ") &&!table[4].equals(" ") && !table[5].equals(" ") &&
                !table[6].equals(" ") &&!table[7].equals(" ") &&!table[8].equals(" ") ){
            System.out.println("remis");
            return true;
        }

        return false;
    }

    public static void userMove() {

            System.out.println("postaw kolko: ");
            String coordinates = input.next();

            switch (coordinates) {
                case "1":
                    if (!table[0].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[0] = "o";
                        moveUser = true;
                        break;
                    }

                case "2":
                    if (!table[1].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[1] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "3":
                    if (!table[2].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[2] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "4":
                    if (!table[3].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[3] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "5":
                    if (!table[4].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[4] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "6":
                    if (!table[5].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[5] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "7":
                    if (!table[6].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[6] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "8":
                    if (!table[7].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[7] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                case "9":
                    if (!table[8].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw kolko w wolnym miejscu");
                        userMove();
                    } else {
                        table[8] = "o";
                        moveUser = true;
                        checkResult();
                        break;
                    }
                default:
                    System.out.println("wpisz poprawny numer");

            }
    }

    public static void user2Move() {
            System.out.println("postaw krzyzyk: ");
            String coordinatesCross = input.next();

            switch (coordinatesCross) {
                case "1":
                    if (!table[0].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[0] = "x";
                        moveUser = false;
                        checkResult();

                    }
                    break;
                case "2":
                    if (!table[1].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[1] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "3":
                    if (!table[2].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[2] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "4":
                    if (!table[3].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[3] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "5":
                    if (!table[4].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[4] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "6":
                    if (!table[5].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[5] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "7":
                    if (!table[6].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[6] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "8":
                    if (!table[7].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[7] = "x";
                        moveUser = false;
                        checkResult();
                        break;
                    }
                case "9":
                    if (!table[8].equals(" ")) {
                        System.out.println("to miejsce jest już zajete, postaw krzyzyk w wolnym miejscu");
                        user2Move();
                    } else {
                        table[8] = "x";

                        moveUser = false;
                        checkResult();
                        break;
                    }
                default:
                    System.out.println("Wpisz poprawny numer");
            }
    }

    public static void printTable(){
        System.out.println(table[0] + " |"+ table[1] + " |"+ table[2]+ " |");
        System.out.println(table[3] + " |"+ table[4] + " |"+ table[5]+ " |");
        System.out.println(table[6] + " |"+ table[7] + " |"+ table[8]+ " |");
    }
    public static void main(String[] args) {

        while (!checkResult()){
            printTable();
            if (!moveUser){
                userMove();
            } else {
                user2Move();
            }
        }
        printTable();

    }
}

