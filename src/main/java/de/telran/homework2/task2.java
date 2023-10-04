package de.telran.homework2;

public class task2 {
    public static void main(String[] args) {

        int m = mult(35, 5);
        System.out.println(m);
        System.out.println(add(35, 5));
        System.out.println(sub(35, 5));
        System.out.println(div(35, 5));


    }

    private static int mult(int num1, int num2){

        int result = num1 * num2;
        return result;

    }

    private static int add(int num1, int num2){

        int result = num1 + num2;
        return result;

    }
    private static int sub(int num1, int num2){

        int result = num1 - num2;
        return result;

    }

    private static int div(int num1, int num2){

        int result = num1 / num2;
        return result;

    }


}


//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль