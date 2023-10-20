package homework5;
import java.util.Scanner;

public class task1 {


    public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();


            double numberReturn = calculationNumber(num1,num2);
            if (numberReturn==0){
                System.out.println("Оба числа одинаково близки к 10! ");
            }else {
                System.out.println(numberReturn + " ближе к 10");
            }

        }
        static double calculationNumber (double num1, double num2){
            double result1 = Math.abs(num1-10);
            double result2 = Math.abs(num2-10);
            if (result1==result2){
                return 0;

            }else
            if (result1 < result2){
                return num1;
            }else
                return num2;


        }

    }

//№1
//
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.
}
