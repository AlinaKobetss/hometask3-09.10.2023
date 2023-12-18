package de.telran.homework2;

public class task1 {

    public static void main(String[] args) {

        String str1 = new String("I study Basic Java!");

        System.out.println("Length str1 = "+str1.length());

        char symbol = str1.charAt(17);

        System.out.println("Предпоследний символ str1 = "+ symbol);


        System.out.println("str1 содержит ли подстроку Java = "+ str1.contains("Java"));

        String subStr = str1.substring(14, 18);
        System.out.println("Подстрока str1 = "+ subStr);


        String strTemp = str1.replace('a','o');

        System.out.println(strTemp.replace('A','O'));


        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

    }
}



//Создайте строку через new - I study Basic Java!
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.