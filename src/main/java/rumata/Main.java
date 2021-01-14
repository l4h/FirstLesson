package rumata;


public class Main {
    static boolean bool =true;
    static byte aByte=0; //-128 - 127
    static short aShort=12; //short 16 bit
    static char aChar='f';
    static int anInt =32000; // int 32 bit
    static float aFloat=0.0F;
    static double aDouble=0.0;

    static Long aLong = 123L;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=3) {
            float result = calculateExpression(i+10,i-5,i,i-1);
            System.out.println("Результат вычисления выражения:"+result);
        }

        int numberOne=50, numberTwo=-30;
        boolean sumInRange = inRange(numberOne,numberTwo);
        System.out.println("Входит ли сумма чисел("+numberOne+"," + numberTwo+") в диапазон от 10 до 20: " + sumInRange);
        isPositive(anInt);
        System.out.println("Число переданное в параметр отрицательное: "+isNegative(-88));
        doHello("Александр");
        String name = "Alexandr";
        doHello(name);
        for (int i = 1; i <= 2021; i+=485) {
            isLeapYear(i);
        }
    }

    //Вычисляет выражение все составляющие которого передаются в параметрах
     static float  calculateExpression(float a, float b, float c, float d){
//        Проверим что d!=0, все остальное программа стерпит и условиями не задано иного
        if(d==0) {
            System.out.println("4-й параметр этого метода не может быть 0. Попробуйте еще раз");
            return 0;
        }
        return a*(b-(c/d));
    }

    //Метод определяет входит ли сумма переданных параметров в диапазон между 10 и 20
    static boolean inRange(int a, int b){
        int c=a+b;
        if (c>=10 && c<=20) return true;
        else return false;
    }


    //Метод получается на вход целое число и выводит на экран положительное оно или отрицательное
    static void isPositive(int number){
       if(number>=0) System.out.println("Positive");
       else System.out.println("Negative");
    }

    //задание 6
    static boolean isNegative(int number){
        if(number>=0)return false;
        else return true;
    }

    //задание 7
    static void doHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    //Задание 8
    static void isLeapYear(int year){
        if(((year%4) ==0 && (year%100)>0)||(year%4)==0 &&(year%400)==0) System.out.println(year + " Високосный год");
        else System.out.println(year + " Год не високосный");
    }

}
