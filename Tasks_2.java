package homework;

public class HW2 {

    public static void main(String[] args) {

        //Part 2
        int k = 5;
        int m = 15;
        int l = 10;
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int devKL = k / l;
        String t = "Task #11";
        String line = "_________________________________";



        //11.1
        System.out.println(line);
        System.out.println(t);
        System.out.println("k\nl\nm");

        //11.2
        t = "Task #11.2";
        System.out.println(line);
        System.out.println(t);
        System.out.println(k);
        System.out.println(m);
        System.out.println(l);

        //13
        t = "Task #13";
        System.out.println(line);
        System.out.println(t);
        System.out.println(k + " " + l + " " + m);

        //14
        t = "Task #14";
        System.out.println(line);
        System.out.println(t);
        System.out.println("5, 10, 15");

        //15
        t = "Task #15";
        System.out.println(line);
        System.out.println(t);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
        System.out.println("l = " + l);

        //16
        t = "Task #16";
        System.out.println(line);
        System.out.println(t);
        System.out.println(sumKL);
        System.out.println(multKM);
        System.out.println(subLM);

        //17
        String textS = ", а остаток от деления = ";
        String textF = "Результат деления";

        t = "Task #17";
        System.out.println(line);
        System.out.println(t);
        System.out.println(textF + " k на l = " + devKL + textS + k % l);
        System.out.println(textF + " k на m = " + k / m + textS + k % m);
        System.out.println(textF + " k на k = " + k / k + textS + k % k);
        System.out.println(textF + " l на m = " + l / m + textS + l % m);
        System.out.println(textF + " l на k = " + l / k + textS + l % k);
        System.out.println(textF + " l на l = " + l / l + textS + l % l);
        System.out.println(textF + " m на k = " + m / k + textS + m % k);
        System.out.println(textF + " m на l = " + m / l + textS + m % l);
        System.out.println(textF + " m на m = " + m / m + textS + m % m);

        //18
        int apple = 40;
        int student = 6;
        int teacher = apple % student;

        String text3 = " яблок поделить на ";
        String text4 = " ученика/ов, то каждый ученик получит по ";
        String text5 = " яблок/а останется учителю/";
        String t6 = " яблок/а, и ";

        t = "Task #18";
        System.out.println(line);
        System.out.println(t);
        System.out.println("Если " + apple + text3 + student + text4 + apple / student + t6 + teacher + text5);

        apple = 100;
        student = 21;

        System.out.println("Если " + apple + text3 + student + text4 + apple / student + t6 + teacher + text5);

        //19
        int sumKLM = k + l + m;
        m++;
        sumKLM--;
        int sumLKM = l + k + m;
        String t7 = "Сумма чисел k, l, m++ и sumKLM-- = ";
        String text19 = ", а разность m++ и sumLKM = ";

        t = "Task #19";
        System.out.println(line);
        System.out.println(t);
        System.out.println(t7 + ((k + l + m++) + sumKLM--) + text19 + (m++ - sumLKM));

        //20
        t = "Task #20";
        System.out.println(line);
        System.out.println(t);
        System.out.println("48 кратно 8, т.к. 48 : 8 = " + 48/8 + ", остаток = " + 48 % 8 +".");
        System.out.println("48 : 2 = " + 48/2 + ", остаток = " + 48 % 2 + " - четное.");
        System.out.println("8 : 2 = " + 8/2 + ", остаток = " + 8 % 2 + " - четное.");
        System.out.println("47 : 2 = " + 47/2 + ", остаток = " + 47 % 2 + " - нечетное.");
        System.out.println("49 : 2 = " + 49/2 + ", остаток = " + 49 % 2 + " - нечетное.");

        //Part 3

        //
        int x = 2;
        int y = 3;
        int p = x + 3;
        int f = (3 + 4 * x) / 5;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        int g = (10 * (y - 5) * (a + b + c)) / x;
        int h = 9 * (x / 4 + (9 + x) / y);
        int j = (5 * x + 7 * y)/(8 * x + 10 * y);
        int o = (3 * x - y)/(x + y);
        int q = c / d;
        int r = a + b;



        //21
        t = "Task #21";
        System.out.println(line);
        System.out.println(t);
        System.out.println("(x + 3)^2");
        //System.out.println(" 3 + 4x\n"+line+"\n  5");
        System.out.println("(3 + 4x)/ 5 - (10(y - 5)(a + b + c))/ x + 9(4/x +(9 + 4)/ y)");
        System.out.println("( ((5x + 7y) / (8x + 10y)) / ((3x - y) / (x + y)) ) / (a + b + c / d + (a + b) / (c + d) + ab)");

        //22
        t = "Task #22";
        System.out.println(line);
        System.out.println(t);
        System.out.println("_________________");
        System.out.println("| task | result |");
        System.out.println("_________________");
        System.out.println("|  21  |  "   + p * p + "    |");
        System.out.println("_________________");
        System.out.println("|  22  |  "   + (f - g + h) + "   |");
        System.out.println("_________________");
        System.out.println("|  23  |  "   + ((j/o)/r+q+r/(c+d)+a*b) + "   |");
        System.out.println("_________________");




    }
}

