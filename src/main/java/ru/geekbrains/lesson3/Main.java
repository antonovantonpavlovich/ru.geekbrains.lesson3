package ru.geekbrains.lesson3;

public class Main {

    public static void main(String[] args) {

        massivOne();
        massivHundred();
        massivMultiplyTwo();
        massivDiagonal();

    }


    public static void massivOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void massivHundred() {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void massivMultiplyTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void massivDiagonal() {
        int counter = 0;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = 0;
                table[i][i] = 1;
                System.out.print(table[i][j] + " ");
            }
                System.out.println();
            }
        }
    public static void massivLen(){
        int len;
        int initialValue;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println();
    }
    }