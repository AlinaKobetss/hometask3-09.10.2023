package homework9;
import java.util.Arrays;
public class task1 {
        public static void main(String[] args) {
            int rangeFrom= 1;
            int rangeUpTo= 10;
            int[] arr = new int[rangeUpTo-1];


            task1_2.getSortBubbleWithConditions(task1_2.getArrayWithInterval(arr, rangeFrom, rangeUpTo), rangeFrom, rangeUpTo);
            System.out.println(Arrays.toString(arr));
            System.out.println("Недостающий элемент цифра: "+task1_2.getMissingNumber(arr));

            int[] arrTest ={1,2,3,5};
            System.out.println("Недостающий элемент цифра: "+task1_2.getMissingNumber(arrTest));

            int[] arrTest2 = {6,1,2,8,3,4,7,10,5};
            Arrays.sort(arrTest2);
            System.out.println("Недостающий элемент цифра: "+task1_2.getMissingNumber(arrTest2));

        }}



//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9