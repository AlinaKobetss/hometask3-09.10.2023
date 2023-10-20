package homework4;

public class task1 {
    public static void main(String[] args) {
        int num;
        int scale;
        int notation;
        num=333;
        scale= 16;
        notation = 10;
        String resultNotation = convertNumber(num,scale,notation);
        System.out.println("Перевод числа: "+num+" из "+scale+"-ричной "+"в "+notation+"-ричную= "+resultNotation);
        num = 819;
        scale = 10;
        notation = 16;
        String resultNotation2 = convertNumber(num,scale,notation);
        System.out.println("Перевод числа: "+num+" из "+scale+"-ричной "+"в "+notation+"-ричную= "+resultNotation2);
        num = 101101;
        scale= 2;
        notation = 10;
        String resultNotation3 = convertNumber(num,scale,notation);
        System.out.println("Перевод числа: "+num+" из "+scale+"-ричной "+"в "+notation+"-ричную= "+resultNotation3);
        num = 124;
        scale = 10;
        notation = 2;
        String resultNotation4 = convertNumber(num,scale,notation);
        System.out.println("Перевод числа: "+num+" из "+scale+"-ричной "+"в "+notation+"-ричную= "+resultNotation4);



    }
    static String convertNumber(int a, int b, int c){
        long result1 = Long.parseLong(String.valueOf(a),b);
        return Long.toString(result1,c);

    }
}


//Переведите число 333 из 16-ричной в 10-ричную
//Переведите число 819 из 10-ричной в 16-ричную
//101101 в двоичной, переведите в 10-ричную
//124 в десятичной, переведите в 2-ичную
