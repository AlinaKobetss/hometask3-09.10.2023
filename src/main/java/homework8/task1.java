package homework8;
import java.util.Random;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

            int [] arr = new int[8];
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt((50 - 1 + 1) + 1);
            }
            System.out.println(Arrays.toString(arr));

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));


        
    }
}
