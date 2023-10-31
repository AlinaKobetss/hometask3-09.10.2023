package homework8;

import java.util.Random;
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arrInt = new int[5];
        int example = 0;
        boolean isSorted = true;
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = rnd.nextInt((99 - 10 + 1) + 10);
            if (arrInt[i] < example) {
                isSorted = false;
            }
            example = arrInt[i];
        }
        System.out.println(Arrays.toString(arrInt));
        System.out.println(isSorted ? "Массив строго возрастающий" : "Массив не строго возрастающий");
    }
    }

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том,
// является ли массив строго возрастающей последовательностью.