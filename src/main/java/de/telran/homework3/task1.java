package de.telran.homework3;

import java.util.Locale;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word:");
        String str1 = scanner.next();
        System.out.print("Enter second word:");
        String str2 = scanner.next();

        String strnew = new String("Прекрасная погода");


        System.out.println("Length str1 = "+strnew.length());

        String strnew1 = strnew.substring(0,5);
        String strnew2 = strnew.substring(14,17);
        System.out.println("New word = "+ strnew1 + strnew2);


    }}

//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa