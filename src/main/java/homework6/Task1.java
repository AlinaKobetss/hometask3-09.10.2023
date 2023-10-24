package homework6;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random random = new Random();

        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();

        int resultCanBuy = canBuy(isEdekaOpen,isReweOpen);

        if (resultCanBuy== 1){
            System.out.println("Я могу купить молоко в Edeka!");
        }else
        if (resultCanBuy==2){
            System.out.println("Я могу купить молоко в Rewe!");
        }else
            System.out.println("Оба магазина закрыты!"); }
    static int canBuy (boolean edeka, boolean rewe){
        if (edeka){ return 1;
        }
        else if (rewe){ return 2;}
        else return 0;}
}

//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.

