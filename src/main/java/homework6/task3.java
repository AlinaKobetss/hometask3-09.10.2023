package homework6;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int n1= scanner.nextInt();
        System.out.print("Введите число 2: ");
        int n2= scanner.nextInt();
        System.out.print("Введите число 3: ");
        int n3= scanner.nextInt();
        int resultGetMax = getMax(n1,n2,n3);
        System.out.println(resultGetMax + " max число!");

    }
    static int getMax (int n1,int n2,int n3){
        if (n1>=n2 &&  n1>=n3){
            return n1;
        } else if (n2>n1 && n2>n3) {
            return n2;
        } else
            return n3;
    }
}

//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер).
//   Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
//Напечатает максимум из трех чисел.