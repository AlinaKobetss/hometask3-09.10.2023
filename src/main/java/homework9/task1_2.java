package homework9;

import java.util.Objects;
import java.util.Random;

public class task1_2 {
        public static int getMissingNumber(int[] arr){
            int soughtFor = (arr[0])-1;

            for (int i = 0; i < arr.length-1; i++) {
                if (++arr[i] !=arr[i+1]){
                    soughtFor = arr[i];
                    break;
                }
                if (soughtFor==0){
                    soughtFor= arr.length+1;
                }
            }
            return soughtFor;
        }
        public static int[] getArrayWithInterval (int[] arr, int rangeFrom, int rangeUpTo){
            Random random= new Random();
            for (int i = 0; i< arr.length; i++){
                arr[i]=random.nextInt(rangeUpTo-rangeFrom)+rangeFrom;
            }
            return arr;
        }
        public static int[] getSortBubbleWithConditions(int[] arrInt, int rangeFrom, int rangeUpTo) {
            boolean isSorted;
            do {

                isSorted=false;
                for (int i = 0; i < arrInt.length - 1; i++) {
                    if (arrInt[i]==arrInt[i+1]){
                        arrInt[i+1]++;
                    }
                    if (arrInt[i] > arrInt[i + 1]) {
                        int temp = arrInt[i];
                        arrInt[i] = arrInt[i + 1];
                        arrInt[i + 1] = temp;
                        isSorted = true;
                    }
                    if (arrInt[arrInt.length-1]> arrInt.length+1){
                        i=0;
                        getArrayWithInterval(arrInt, rangeFrom, rangeUpTo);
                    }
                }
            }while (isSorted);
            return arrInt;
        }



        public static String[] getStrArray(String str) {
            return str.split(",\\s*");
        }

        public static void printBottomLine(String[] str){
            StringBuilder resultStr = new StringBuilder("SELECT * FROM cars WHERE ");
            boolean firstTimeCondition=true;
            for (int i = 0; i < str.length; i+=2) {
                String str1= str[i];
                String str2= str[i+1];
                if (Objects.equals(str2, "null")||Objects.equals(str2, null)){
                    continue;
                }
                if (!firstTimeCondition) {
                    resultStr.append(" AND ");
                }
                resultStr.append(str1).append(" = ").append(str2);
                firstTimeCondition=false;


            }
            System.out.println(resultStr);

        }
    }
