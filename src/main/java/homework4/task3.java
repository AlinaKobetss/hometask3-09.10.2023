package homework4;
import java.util.Scanner;
public class task3 {


        public static void main(String[] args) {
            double currentExchangeRateEuroToDollar = 1.05;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ввведите сумму в Евро, которую Вы хотите конвертировать: ");
            double customEuro = scanner.nextDouble();
            double resultExchange = toDollars(customEuro,currentExchangeRateEuroToDollar);
            System.out.println(customEuro+" Euro = "+resultExchange+" Dollars");

        }
        static double toDollars(double euro, double exchange){
            return euro* exchange;
        }


//Программа запрашивает у пользователя сумму в Евро для конвертации
//Реализовать метод, который конвертирует полученную сумму в сумму в долларах США
}
