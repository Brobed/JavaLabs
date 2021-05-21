package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row,column,value, count = 0;

        Scanner console = new Scanner(System.in);
        System.out.print("Количество строк: ");
            row = console.nextInt();
        System.out.print("Количество столбцов: ");
            column = console.nextInt();
        System.out.print("Число, которое нужно искать: ");
            value = console.nextInt();

        Random random = new Random();
        int[][] arr = new int[row][column];

        for (int r = 0; r < row; r++) { //заполнение массива
            for (int c = 0; c < column; c++) {
                arr[r][c] = 50 - random.nextInt(100);
            }
        }
        for (int r = 0; r < row; r++){ // вывод массива
            for (int c = 0; c < column; c++){
                System.out.print("" + arr[r][c] + "|");
            }
            System.out.println();
        }
        for (int r = 0; r < row; r++){ // поиск совпадений
            for (int c = 0; c < column; c++){
                if (arr[r][c] != value){
                    count += 1;
                    System.out.println(count + "-е не совпавшее число");
                    System.out.println("Координаты" + "[" + r + "]" + "[" + c + "]");
                }
            }
        }



//        for (int i=0; i < 100; i++) {
//            int x  = 50 - random.nextInt(100);
//            System.out.println(x);
//        }

    }
}
