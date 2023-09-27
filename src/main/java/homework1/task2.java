package homework1;

public class task2 {

    public static void main(String[] args) {

        int myInt = 785;

        int myInt1 = myInt/100;
        int myInt2 = (myInt/10) % 10;
        int myInt3 = myInt % 10;

        System.out.println(myInt1 + "," + myInt2 + "," + myInt3);

    }
}






//Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5