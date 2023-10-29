package homework7;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature1 = random.nextInt(160);
        int temperature2 = random.nextInt(80);
        if (isTemperatureHigher(temperature1,temperature2)){
            System.out.println("Прибор работает корректно");
        }else
            System.out.println("Прибор не работает");

    }
    public static boolean isTemperatureHigher(int tem1,int tem2){
        return tem1 > 100 && tem2 < 100;
    }
}











//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
// а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.