package homework;

import static java.lang.Integer.*;

public class HW3 {
    public static void print (String text){
        System.out.println(text);

    }


    public static void main(String [] args) {

        //Task 01
        //В homework создать класс HW3.


        //Task 02
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

        String tLine = "~~~~~~";
        String t1 = "Task ";
        int t1N = 2;
        String line = ("________________________________________________________________________");
        byte a = 123;
        byte b = -123;

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println("\ta = 123\n\tb = -123");


        //Task 03
        //Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.

        short s = 32000;
        short t = -28000;


        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println("\t"+(s-t));


        //Task 04
        //Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        //Затем присвоить максимально возможное значение этого типа.
        //Распечатать оба значения в виде таблицы.
        int i = MIN_VALUE;

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println(line);
        System.out.println("|\tint min\t\t\t\t\t\t\t" + "| значение i = " +i+"\t\t\t|");
        System.out.println(line);
        i = Integer.MAX_VALUE;
        System.out.println("|\tint min\t\t\t\t\t\t\t" + "| значение i = " +i+"\t\t\t|");
        System.out.println(line);



        //Task 05
        //Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города.
        long phoneNumber = 74951234567L;
        //long потому что длинный мер

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));

        System.out.println("\t" +phoneNumber);
        System.out.println(line);


        //Task 06
        //Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и
        //присвоить ей значение 1000.101101.
        //Распечатать результат в виде таблицы.
        float f = 100.101101F;
        double d = 100.101101;

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));

        System.out.println(line);
        System.out.println("| float f = 100.101101              | значение f    " + 100.101101F + "\t\t\t|");
        System.out.println(line);
        System.out.println("| double d = 1000.101101            | значение d    " + 1000.101101 +"\t\t\t|");
        System.out.println(line);



        //Task 07
        //7.1 Создать переменную типа Double с именем dd
        //и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        //7.2 Создать переменную типа Float с именем ff
        //и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        //
        //Распечатать результаты задания №7, как продолжение таблицы из задания № 6.
        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;


        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));


        System.out.println("| Double dd = 10.09999 + 20.099999  | значение dd =  " + dd +" |");
        System.out.println(line);
        System.out.println("| Float ff = 10.09999F + 20.099999F | значение ff =  " + ff +"\t\t\t|");
        System.out.println(line);


        //Task 08
        //Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)

        double result = 10.0/3;
        //или double result = 10/3d;
        //или double k = ((double)10)/3;

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println("\t" +result);


        //Task 09
        //Создать переменные sum, product, quotient и reminder, и  присвоить им значения вычислений переменных f и d
        double sum;
        sum = f + d;
        double product;
        product = f * d;
        double quotient;
        quotient = f / d;
        double reminder;
        reminder = f % d;

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println(line);
        System.out.println("|\tsum\t\t\t\t\t\t\t\t\t" + "| " +sum+"\t\t\t|");
        System.out.println(line);
        System.out.println("|\tproduct\t\t\t\t\t\t\t\t" + "| " +product+"\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tquotient\t\t\t\t\t\t\t" + "| " +quotient+"\t\t\t|");
        System.out.println(line);
        System.out.println("|\treminder\t\t\t\t\t\t\t" + "| " +reminder+"\t\t\t|");
        System.out.println(line);


        //Task 10
        //Распечатать слово HELLO точками

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));

        String ll = "♻"; // ✫; 💕; 🌸; ♻
        String ll4 = ll+ll+ll;

        System.out.println(ll+"   "+ll+"  "+ll4+"  "+ll+"    "+ll+"     "+ll4+ "\n"+ll+"   "+ll+"  "
                +ll+"     "+ll+"    "+ll+"    "+ll+"   "+ll+"\n"+ll+""+ll4+"  "+ll4+"  "+ll+"    "+ll+
                "    "+ll+"    "+ll+"\n"+ll+"   "+ll+"  " +ll+"     "+ll+"    "+ll+"    "+ll+"   "+ll+"\n"+ll+"   "+ll+
                "  "+ll4+"  "+ll4+" "+ll4+"   "+ll4);


        //Task 11
        //Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        //t1 = 0;
        //t2 = 150; bite
        //t3 = -120; bite
        //t4 = - 505.505; float
        //t5 = 100100; int
        //t6 = 100010001000; long or big intenger > long
        //t7 = 2.66666666666666; double
        //t8 = - 1000000.001; double
        //t9 = 1010; short
        //
        //Распечатать значения всех переменных


        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));


        //Task 12
        //С помощью полей классов ссылочного типа распечатать таблицу.

        line = "______________________________________________________________________________________________________";


        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println(line);
        System.out.println("|\tType\t\t|\tSize in bites\t\t|\tmin\t\t\t\t\t\t|\tmax\t\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tbyte\t\t|\t"+Byte.SIZE+"\t\t\t\t\t|\t"+Byte.MIN_VALUE+"\t\t\t\t\t|\t"
                +Byte.MAX_VALUE+"\t\t\t\t\t\t\t|");
        //System.out.println("|\t" +Byte.TYPE+ "\t\t|\t"+Byte.SIZE+"\t\t\t\t\t|\t"+Byte.MIN_VALUE+"\t\t\t\t\t|\t"
        // +Byte.MAX_VALUE+"\t\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tshort\t\t|\t"+Short.SIZE+"\t\t\t\t\t|\t"+Short.MIN_VALUE+"\t\t\t\t\t|\t"
                +Short.MAX_VALUE+"\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tint\t\t\t|\t"+Integer.SIZE+"\t\t\t\t\t|\t"+ MIN_VALUE+"\t\t\t\t|\t"
                +Integer.MAX_VALUE+"\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tlong\t\t|\t"+Long.SIZE+"\t\t\t\t\t|\t"+Long.MIN_VALUE+"\t|\t"
                +Long.MAX_VALUE+"\t\t\t|");
        System.out.println(line);
        System.out.println("|\tfloat\t\t|\t"+Float.SIZE+"\t\t\t\t\t|\t"+Float.MIN_VALUE+"\t\t\t\t\t|\t"
                +Float.MAX_VALUE+"\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tdouble\t\t|\t"+Double.SIZE+"\t\t\t\t\t|\t"+Double.MIN_VALUE+"\t\t\t\t|\t"
                +Double.MAX_VALUE+"\t\t|");
        System.out.println(line);



        //Task 13
        //Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        //сравнить 2 переменные друг с другом с помощью метода .equal.
        //Вывести результат сравнения на печать в виде выражения:
        //“Если num1 = num2, то результат сравнения методом .equal = …”
        //
        //Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        //“Если num1 не равно num2, то результат сравнения методом .equal = …”

        Integer num1 = 9;
        Integer num2 = 9;
        String num12 = "Если num1 = num2, то результат сравнения методом .equal = ";

        System.out.println("\t\t\t"+(tLine+t1+(t1N++)+tLine));
        System.out.println(num12 +num1.equals(num2));

        num1 = 8;
        num2 = 9;
        String num21 = "Если num1 не равно num2, то результат сравнения методом .equal = ";

        System.out.println(num21 + num1.equals(num2));


        //Task 14
        //Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        //а) одинаковыми значениями
        //b) number1 < number2
        //c) number1 > number2
        //сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет), и вывести результаты
        // сравнения на печать в виде выражений:
        //“Если number1 = number2, то результат сравнения методом … = …”
        //“Если number1 < number2, то результат сравнения методом … = …”
        //“Если number1 > number2, то результат сравнения методом … = …”

        int number1 = 7;
        int number2 = 7;
        String first = "Если number1 = number2, то результат сравнения методом compare = ";


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println("number1 = 7\nnumber2 = 7");
        System.out.println(first +compare(number1,number2));
        //или так:
        // System.out.println(first + (Integer.compare(number1,number2)));



        number1 = 77;
        number2 = 78;
        String second = "Если number1 < number2, то результат сравнения методом compare = ";

        System.out.println("number1 = 77\nnumber2 = 78");
        System.out.println(second + compare(number1,number2));


        number1 = 87;
        String third = "Если number1 > number2, то результат сравнения методом compare = ";

        System.out.println("number1 = 87\nnumber2 = 78");
        System.out.println(third + compare(number1,number2));


        //Task 15
        //Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
        //*Чтобы преобразовать Float в int, следует использовать метод .intValue()*

        Float t12 = 234.9999F;


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);;
        System.out.println("Float t12 = 234.9999F\nint = " + t12.intValue());




        //Task 16
        //С помощью метода sum() класса Double посчитать сумму двух переменных типа double

        double t121 = 7.35;
        double t123 = 35.7;

        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println("double t121 = 7.35\ndouble t123 = 35.7\nSum = " + Double.sum(t121,t123));




        //Task 17
        //С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float

        Float t17 = 251.152F;
        Float t171 = 152.251F;


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println("Float t17 = 251.152F\nFloat t171 = 152.251F\nInteger.sum = "
                + Integer.sum(t17.intValue(),t171.intValue()));
        System.out.println("\n");


        //Task 18
        //Создать 2 переменные типа Short:
        //short1 = 12000
        //short2 = 12300
        //a.	Распечатать фразу:
        //“12000 - 12300 = -300”
        //где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        //b.	Присвоить переменной short1 значение 12500, вывести фразу:
        //“12500 - 12300 = 200”
        //где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

        Short short1 = 12000;
        Short short2 = 12300;
        String ss = "12000 - 12300 = ";


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println(ss + Short.compare(short1,short2));

        short1 = 12500;
        ss = "12500 - 12300 = ";

        System.out.println(ss + short1.compareTo(short2));
        System.out.println("\n");


        //Task 19
        //Создать переменные:
        //String str1 = "123.56";
        //String str2 = "123.55";
        //Double doub1 = 123.56;
        //Double doub2 = 123.55;
        //
        //Распечатать результат doub1 - doub2
        //
        //Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        String dD = "doub1 - doub2 = ";
        String sS = "str1 - str2 = ";


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println(dD + (doub1-doub2));
        //System.out.println(dD + Double.compare(doub1,doub2));
        //или так:
        // System.out.println(dD + doub1.compareTo(doub2));
        System.out.println(sS + (Double.valueOf(str1)-Double.valueOf(str2) ));
        //.valueOf() переводит переменную в нужный тип
        System.out.println("\n");



        //Task 20
        //Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        //(значения температуры в Цельсиях).
        //Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
        //Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
        //Распечатать результат среднего значения температуры тела кота.

        Double tCat;
        tCat = 38.5;
        Double average;
        average = tCat/2;
        tCat = 35.1;
        average = average + tCat/2;

        String cat2 = "Cреднее значение температуры тела кота округленное с помощью метода класса Math.round ";
        String cat1 = "Cреднее значение температуры тела кота ";



        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println(cat2 + Math.round(average) + "t");
        System.out.println("\n");

        //Float tCat = 38.5F;
        //Float tCat1 = tCat/2;
        //tCat = 37.5F;
        //Float tCat2 = tCat/2;
        //Float tCat = tCat1 + tCat2;

        //System.out.println(cat2 + Math.floor(tCat));


        //Task 21
        //Создать переменную n типа Number, присвоить ей максимально возможное значение.
        //Присвоить n значение 10,
        //затем присвоить n значение 10.999999999.
        //
        //Распечатать результаты в виде выражения:
        //“Переменная может быть принимать значения:
        // n =  …
        // n =  …
        // n =  …
        // Это возможно, потому что …”

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        String num = "Переменная n может принимать значения:";
        String numb = "потому что Абстрактный класс Number является суперклассом классов платформы, " +
                "\nпредставляющих числовые значения, которые могут быть преобразованы в примитивные типы " +
                "\nbyte, double, float, int, long и short.";

        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println(num + "\nn = " + Double.MAX_VALUE + "\nn = " + n.intValue() + "\nn = " + n +
                "\n" + numb);
        System.out.println("\n");




        //Task 22
        //Создать переменную Integer numberInteger = 100.
        //Доказать, что numberInteger имеет тип Integer,
        //а numberInteger.toString() имеет тип String

        Integer numberInteger = 100;

        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);
        System.out.println("numberInteger = 100 имеет тип Integer: \nЕсли +1, то = " + (numberInteger + 1));
        System.out.println("numberInteger.toString() имеет тип String: \nЕсли +1, то = "
                + (numberInteger.toString() + 1));

        String numberInt = numberInteger.toString();
        //System.out.println(numberInteger.getClass());
        //System.out.println(numberInt.getClass());

        System.out.println("numberInteger имеет тип Integer - " + (numberInteger instanceof Integer));
        System.out.println("numberInteger.toString() имеет тип String - " + (numberInt instanceof String));
        System.out.println("\n");



        //Task 23
        //Вывести на экран следующие выражения, используя для печати только переменные:
        //“36.6 градусов по Цельсию  = … градусов по Фарингейту”, где значение по Фарингейту
        // должно быть вычислено по формуле
        //“50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам.

        double c = 36.6;
        double f1 = c * 1.8 + 32;
        double kG = 50;
        double lBs = kG * 2.205;
        double lBs1 = 50;
        double kG1 = lBs1 * 0.45359293319936;


        System.out.println("\t\t\t" + tLine+t1+(t1N++)+tLine);;
        System.out.println("36.6 градусов по Цельсию  = " + f1 + " градусов по Фарингейту");
        System.out.println("50 kilogram = " + lBs + " lbs, 50 lb = " + kG1 + " kg");






    }
}

