package de.telran.homework3;

public class task2 {

    public static void main(String[] args) {

        int a = 1445, b = 46;

        int m = mult(a, b);
        System.out.println(m);
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(div(a, b));

    }

    private static int mult(int a, int b){
        int result = a * b;
        return result;}

    private static int add(int a, int b){
        int result = a + b;
        return result;}
    private static int sub(int a, int b){

        int result = a - b;
        return result;}
    private static int div(int a, int b){
        int result = a / b;
        return result;
    }
}

//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.