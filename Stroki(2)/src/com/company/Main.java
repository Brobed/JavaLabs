package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String newStr = new String();
        int [] LettersCount = new int[59]; // кол-во встреч букв
        Scanner str = new Scanner(System.in);
        newStr = str.nextLine();
        char[] Alphabet = new
                String("abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя").toCharArray();
        for (int f = 0; f < LettersCount.length-1; f++){
            LettersCount[f] = 0;
        }

        char [] Symbols = newStr.toCharArray(); //преобразование строки в массив символов

        for (int i = 0; i < Alphabet.length; i++){ // проверка на встречу латиницы
            for (int j = 0; j < Symbols.length; j++){
                if (Alphabet[i] == Symbols[j]){
                    LettersCount[i] = LettersCount[i] + 1; // если встретилось, то в счётчик +1
                }
            }
        }

        for (int i = 0; i < LettersCount.length - 1; i++){ //сортировка обоих массивов
            for (int j = i + 1; j < LettersCount.length; j++){
                if (LettersCount[i] < LettersCount[j]){
                    int x = LettersCount[i];
                    LettersCount[i] = LettersCount[j];
                    LettersCount[j] = x;
                    char y = Alphabet[i];
                    Alphabet[i] = Alphabet[j];
                    Alphabet[j] = y;
                }
            }
        }

        for (int i = 0; i < LettersCount.length; i++) { // вывод результата
            System.out.print(Alphabet[i]);
            System.out.print(" - ");
            System.out.println(LettersCount[i]);
        }
    }
}
