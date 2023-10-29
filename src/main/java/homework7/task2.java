package homework7;

public class task2 {

    public static void main(String[] args) {
        int n = 21;
        System.out.println("Через "+getHowManyOperations(n)+" дней вы сможете снять "+n+" сумму");

    }
    public static int getMaxDivider(int n){
//        int divider;
        int maxDivider=1;
        for (int divider = 1; divider < n; divider++) {
            if (n % divider == 0) {
                maxDivider = divider;
            }}
        return maxDivider;
    }
    public static int getHowManyOperations(int n){
        int counter;
        for (counter = 0; n > 0; counter++){
            n= n - getMaxDivider(n);
        }return counter;
    }

}


//У вас на банковском счету N долларов.
//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//Ввод:  N = 21 Выход:  7
//Объяснение:  N = 21
//Снято 7, осталось = 14
//Снято 7, осталось = 7
//Снято 1, осталось = 6
//Снято 3, осталось = 3
//Снято 1, осталось = 2
//Снято 1, Осталось = 1
//Снято 1, осталось = 0

