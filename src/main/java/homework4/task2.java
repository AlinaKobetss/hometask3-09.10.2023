package homework4;

public class task2 {

    public static void main(String[] args) {
        int pizza1 = 24;
        int pizza2 = 28;

        int resultCalories = extraCalories(pizza1,pizza2);
        System.out.println("Лишние каллории: " +resultCalories);
    }
    static int extraCalories (int pizza1, int pizza2){
        int caloriesPerSquareCm= 40;
        int caloriesInFirstPizza= (int) ((Math.PI * pizza1*pizza1/4))*caloriesPerSquareCm;
        int caloriesInSecondPizza= (int) ((Math.PI * pizza2*pizza2/4))*caloriesPerSquareCm;
        int extraCalories= Math.abs(caloriesInFirstPizza-caloriesInSecondPizza);
        return extraCalories;

    }
}

////Напишите программу, которая вычисляет, сколько лишних калорий будет,
// если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
////Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.