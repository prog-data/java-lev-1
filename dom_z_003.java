package ru.geekbrains.eon.j1;
// Егоренков О.Н.

import java.util.Random;
import java.util.Scanner;

public class dom_z_003 {
    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '_';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static void initField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("__x_x_x_");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("y ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Please enter coordinates Y and X (1 to 3) separated by space ");
            y = SCANNER.nextInt() - 1;
            x = SCANNER.nextInt() - 1;
        } while (!isEmptyCell(y, x) || !isValidCell(y, x));
        field[y][x] = HUMAN_DOT;
    }

    private static boolean isEmptyCell(int y, int x) {
        if (isValidCell(y, x)) {                //Добавил проверку на вхождение координат
            return field[y][x] == EMPTY_DOT;
        }
        return false;
    }

    private static boolean isValidCell(int y, int x) {
        return y >= 0 && y < fieldSizeY && x >= 0 && x < fieldSizeX;
    }

    private static void aiTurn() {
        int y;
        int x;
        do {
            x = RANDOM.nextInt(fieldSizeY);
            y = RANDOM.nextInt(fieldSizeX);
        } while (!isEmptyCell(y, x));
        field[y][x] = AI_DOT;
    }

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(y, x))
                    return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
        /*
        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        */

        int kolvo;
        //Проверка по первой оси Y
        for (int y = 0; y < fieldSizeY; y++) {
            kolvo = 0;
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == c) kolvo++;
            }
            if (kolvo == fieldSizeY) return true;
        }
        //Проверка по второй оси X
        for (int x = 0; x < fieldSizeX; x++) {
            kolvo = 0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[y][x] == c) kolvo++;
            }
            if (kolvo == fieldSizeY) return true;
        }
        //Проверка по первой и второй диагонали
        kolvo = 0;
        int kolvo2 = 0;
        for (int y = 0; y < fieldSizeY; y++) {
            if (field[y][y] == c) kolvo++;
            if (field[fieldSizeY-1-y][y] == c) kolvo2++;
        }
        if (kolvo == fieldSizeY) return true;
        if (kolvo2 == fieldSizeY) return true;


        return false;
    }



    public static void main(String[] args) {
        //программа

        while (true) {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkWin(HUMAN_DOT)) {
                    System.out.println("Player wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                printField();
                if (checkWin(AI_DOT)) {
                    System.out.println("Computer wins!");
                    break;
                }
                if (isFieldFull()) {
                    System.out.println("Draw!");
                    break;
                }
            }

            System.out.print("Play again? Enter 'y' to continue ");
            Scanner sc = new Scanner(System.in);
            String contyn = sc.nextLine();
            if (!contyn.equals("y")) break;

        }
    }


}