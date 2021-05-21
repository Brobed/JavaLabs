package com.company;

import java.lang.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row,column;

        Scanner console = new Scanner(System.in);
        System.out.print("Количество строк: ");
        row = console.nextInt();
        System.out.print("Количество столбцов: ");
        column = console.nextInt();


        Random random = new Random();
        int[][] arrTD = new int[row][column];
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int r = 0; r < row; r++) { //заполнение массива
            for (int c = 0; c < column; c++) {
                arrTD[r][c] =  random.nextInt(10);
            }
        }
        for (int r = 0; r < row; r++){ // вывод массива
            for (int c = 0; c < column; c++){
                System.out.print("" + arrTD[r][c] + "|");
            }
            System.out.println();
        }

        for (int r = 0; r < row; r++){
            for (int c = 0; c < column; c++){

                int currentValue = arrTD[r][c];
                int count = -1, mainCount = 0;

                for (int c2 = 0; c2 < column; c2++){
                    if (currentValue == arrTD[r][c2]){
                        count++;
                    }
                    if (count > mainCount){
                        mainCount = count;
                    }
                }
                arr.add(mainCount);
            }
        }
    for (int i = 0; i < row; i++){
        System.out.print("|" + arr.get(i));
    }


    }
}
