package homework8;
import java.util.Arrays;
import java.util.Random;

    public class task1 {
        public static void main(String[] args) {
            int[] randomArr = generateRandomArr(8, 1, 50);
            replaceOddAndPrint(randomArr);
        }
        private static int[] generateRandomArr(int size, int from, int to) {
            Random random = new Random();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(to) + from;
            }
            System.out.println("Массив с " + size + "-ю случайными числами от " + from + " до " + to + " сгенерирован " + Arrays.toString(arr));
            return arr;
        }
        private static void replaceOddAndPrint(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) arr[i] = 0;
            }
            System.out.println("В массиве все нечетные числа заменены на ноль: " + Arrays.toString(arr));
        }
    }


//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.
