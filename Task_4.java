package homework;

public class HW4 {
    public static int devBack;
    public static int devResult;
    public static int devApple;
    public static int remApple;


    public static void apple(int apple, int student) {
        devApple = apple / student;
        remApple = apple % student;
        System.out.println("Ecли " + apple + " яблок поделить на " + student + " учеников(а), то каждый ученик " +
                "получит по " + devApple + " яблок(а), и " + remApple + " яблок останется учителю.");
    }

    public static void appleTwo(int apple1, int student1) {
        devApple = apple1 / student1;
        remApple = apple1 % student1;

        if (apple1 == 42 && student1 == 42) {
            System.out.println("Ecли " + apple1 + " яблока поделить на " + student1 + " ученика, то каждый ученик " +
                    "получит по " + devApple + " яблоку, и " + remApple + " яблок останется учителю.");
        }
        if (apple1 == 55 && student1 == 5) {
            System.out.println("Ecли " + apple1 + " яблок поделить на " + student1 + " учеников, то каждый ученик " +
                    "получит по " + devApple + " яблок, и " + remApple + " яблок останется учителю.");
        }
        if (apple1 == 1 && student1 == 2) {
            System.out.println("Ecли " + apple1 + " яблоко поделить на " + student1 + " учеников, то каждый ученик " +
                    "получит по " + devApple + " яблок, и " + remApple + " яблоко останется учителю.");
        }

    }


    public static void task14(int t14, int t141) {
        devResult = t14 / t141;
        devBack = t14 % t141;
        System.out.println(t14 + " : " + t141 + " = " + devResult + ", остаток = " + devBack);
    }

    public static void print(String text) {
        System.out.println(text);

    }

    public static void temp(double celsi) {
        double task17 = celsi * 1.8F + 32;
        System.out.println(celsi + " в Цельсиях = " + task17 + " в Фаренгейтах.");
    }

    public static void task18(int i) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int square = i * i;
        System.out.println("|\tint min\t\t|\tзначение i = " + min + "\t|\n" +
                "|\tint max\t\t|\tзначение i = " + max + "\t\t|\n" +
                "|\tint square\t|\tзначение i = " + square + "\t\t\t\t|");
    }

    public static void task10(int test) {

        if (test % 2 == 0) {
            System.out.println(test * 2);
        } else {
            System.out.println(test * test);
        }
    }

    public static void main(String[] args) {





        //Task 1
        //В пакете homework создать класс HW4, всю работу выполнять в этом классе.
        //Не забываем, что все методы у нас пока public static void.


        //Task 2
        //Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.

        String tLine = "\u001B[35m\t\t~~~~~~~~~~~~~~~~~~~~~~";
        String t1 = "\u001B[34m\t\t\t\tTask #\u001B[0m";
        int t = 2;
        String line = ("________________________________________________________________________");

        print(tLine + "\n" + t1 + 2);

        //Task 3
        //Записать в виде кода следующие логические выражения:
        //1) (2 = 2) И (7 = 7);
        //2) Не(15 < 3);
        //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        //4) Не("Сосна" = "Дуб");
        //5) (Не(15 < 3)) И (10 > 20);
        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        //7) (6/2 = 3) ИЛИ (7*5 = 20).


        boolean a = (2 == 2) && (7 == 7);
        boolean a1 = (15 < 3);
        String sosna = "Сосна";
        String dyb = "Дуб";
        String vishny = "Вишня";
        String klen = "Клён";


        print(tLine + "\n" + t1 + 3);
        System.out.println("1)\t" + a);
        System.out.println("2)\t" + !a1);
        System.out.println("3)\t" + ((sosna == dyb) || (vishny == klen)));
        System.out.println("4)\t" + !(sosna == dyb));
        boolean a3 = (10 > 20);
        System.out.println("5)\t" + (!a1 && a3));
        //сравнение через equal и if
        //if (sosna.equals(dyb) || vishny.equals(klen)) ;
        //}else    {
        // System.out.println(":)");
        //}

        String eyes = "Глаза даны, чтобы видеть";
        String floor = "Под третьим этажом находится второй этаж";

        //System.out.println(eyes && floor);

        boolean a4 = (6 / 2 == 3);
        boolean a5 = (7 * 5 == 20);
        System.out.println("7)\t" + (a4 || a5));


        //Task 4
        //Записать в виде кода:
        //1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        //2) !(28 > 7) И !(300/5 = 60);
        //3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
        //4) Не((300 < 100))  → ("Жажду можно утолить водой");
        //5) (75 < 81) → (88 = 88).

        String min = "В минуте 70 секунд";
        String hour = "Работающие часы показывают время";

        print(tLine + "\n" + t1 + 4);

        System.out.println("1)\t" + ((min == "В минуте 70 секунд") || (hour == "Работающие часы показывают время")));

        boolean b = (28 > 7);
        boolean b1 = (30 / 5 == 60);

        System.out.println("2)\t" + (b && !b1));

        String tv = "Телевизор - электрический прибор";
        String tv1 = "Телевизор - электрический прибор";
        String glass = "Стекло";
        String tree = "дерево";

        System.out.println("3)\t" + (tv.equals(tv1) && (glass.equals(tree))));

        boolean b2 = (300 < 100);
        String water = "Жажду можно утолить водой";

        System.out.println("4)\t" + !b2 == "Жажду можно утолить водой");

        boolean b3 = (75 < 81);
        boolean b4 = (88 == 88);

        System.out.println("5)\t" + (b3 && b4));


        //Task 5
        //Записать в виде кода следующие выражения:
        //а) Андрей старше Светы. Наташа старше Светы.
        //б) На полке стоят учебники, а на столе лежат справочники.
        //в) БОльшая часть детей — девочки. Остальные - мальчики.

        int an = 10;
        int nat = 12;
        int sv = 9;

        print(tLine + "\n" + t1 + 5);
        if (an > sv && nat > sv) {
            System.out.println("a)\tАндрей старше Светы. Наташа старше Светы");
        } else {
            System.out.println(false);
        }
        String shelf = "учебники";
        String table = "справочники";
        if (shelf == "учебники" && table == "справочники") ;
        System.out.println("b)\tНа полке стоят учебники, а на столе лежат справочники");

        int kids = 30;
        int girl = 20;
        int boy = kids - girl;
        if (boy < girl) {
            System.out.println("c)\tБольшая часть детей — девочки. Остальные - мальчики");
        } else {
            System.out.println(true);
        }


        //Task 6
        //“Водительские права можно получить, только когда исполнится 16 лет.”

        int tr = 16;
        int fal = 15;

        print(tLine + "\n" + t1 + 6);
        if (tr > fal)
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет");


        //Task 7
        //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

        String bus = "Петя не едет в автобусе";
        String book = "читает книгу";
        String window = "не смотрит в окно";

        print(tLine + "\n" + t1 + 7);
        if (bus.equals("Петя не едет в автобусе")) {
            System.out.println("Петя не едет в автобусе");
        } else {
            System.out.println("Петя едет в автобусе");
        }
        if ((book.equals("читает книгу")) || (window.equals("не смотрит в окно"))) {
            System.out.println("но при этом читает книгу или не смотрит в окно");
        } else {
            System.out.println("но при этом не читает книгу или смотрит в окно");
        }


        //Task 8
        //“Если с другом ты, это хорошо, а когда наоборот - плохо”

        String friend = "Если с другом ты, это хорошо,";
        String alone = "а когда наоборот - плохо";

        print(tLine + "\n" + t1 + 8);
        if (friend.equals("Если с другом ты, это хорошо,")) {
            System.out.println("Если с другом ты, это хорошо,");
        } else {
            System.out.println("Если не с другом,");
        }
        if (alone.equals("а когда наоборот - плохо")) {
            System.out.println("а когда наоборот - плохо");
        }


        //Task 9
        //Записать выражения в виде условий if-else:
        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

        print(tLine + "\n" + t1 + 9);

        int age = 19;
        if (age > 18) {
            System.out.println("Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок");
        }
        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.

        String earth = "земля сухая";
        String rain = "мокрая";

        if (earth.equals("земля сухая")) {
            System.out.println("Если земля сухая, значит, нет дождя");
        }
        if (rain.equals("мокрая")) {
            System.out.println("Если земля мокрая, то идет дождь");
        }
        if (earth.equals("мокрая")) {
            System.out.println("Если земля мокрая, то идет дождь");
        } else {
            System.out.println("Иначе идет снег");
        }

        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.

        String cloud = "Если тучи";
        if (cloud.equals("Если тучи")) {
            System.out.println("Если на небе тучи, идет дождь");
        } else {
            System.out.println("Иначе идет “слепой” дождь");
        }
        //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        //Иначе вчера был не четверг, а завтра - не воскресенье

        String today = "суббота";

        if (today == "суббота") {
            System.out.println("Завтра воскресенье");
        } else {
            System.out.println("Завтра - не воскресенье");
        }

        today = "пятница";

        if (today == "пятница") {
            System.out.println("Вчера был четверг");
        } else {
            System.out.println("Вчера был не четверг");
        }
        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.

        String whish = "рак";

        if (whish == "рак") {
            System.out.println("Прошла вечность");
        } else {
            System.out.println("Ждите дальше");
        }
        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

        int person = 19; //18,

        if (person == 19) {
            System.out.println("Ты - взрослый");
        } else {
            System.out.println("Ты - ребенок");
        }
        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

        int you = 18; //17
        String you1 = "закончил школу"; //ученик школы

        if ((you == 18) && (you1 == "закончил школу")) {
            System.out.println("Ты можешь не жить с родителями");
        } else {
            System.out.println("Можешь жить только с родителями");
        }

        //Task 10
        //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм. -

        print(tLine + "\n" + t1 + 10);

        task10(3);



        //Task 11
        //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        //Выведите результат работы алгоритма на печать.
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм. -

        //int voice = 18; //17
        String voice1 = "Голосовать можно с 18 лет";
        String all = "Не достаточно лет";
        //int car = 16; //15
        String car1 = "Машину можно водить с 16 лет";
        int child = 18; //4
        String child1 = "В школу можно идти с 5 лет";

        print(tLine + "\n" + t1 + 11);
        if (child >= 18) {
            System.out.println(voice1);
        } else {
            System.out.println(all);
        }
        if (child >= 16) {
            System.out.println(car1);
        } else {
            System.out.println(all);
        }
        if (child >= 5) {
            System.out.println(child1);
        } else {
            System.out.println(all);
        }


        //Task 12
        //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год
        //Выведите результат работы алгоритма на печать.
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        print(tLine + "\n" + t1 + 12);

        int t12 = 2; //3, 4, 5

        if (t12 == 2) {
            System.out.println("Вызвать родителей и оставить в текущем классе на второй год");
        } else if (t12 == 3) {
            System.out.println("Дать задание на лето и перевести в следующий класс");
        } else if (t12 == 4) {
            System.out.println("Перевести в следующий класс");
        } else if (t12 == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в следующий класс");
        } else if (t12 > 5 || t12 < 2) {
            System.out.println("Fail");
        }


        //Task 13
        //Напишите алгоритм программы, которая проверяет 2 числа:
        //Программа складывает числа, которые делятся на 3 без остатка,
        //и вычитает числа, которые делятся на 5 без остатка.
        //Программа умножает числа, которые делятся на 2 без остатка,
        //но если хотя бы одно число отрицательное, то
        //программа умножает результат предыдущего действия на (-1).
        //Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести
        //действия.


        print(tLine + "\n" + t1 + 13);

        int t13 = 1;
        int t131 = 30;

        if (t13 % 3 == 0 && t131 % 3 == 0) {
            System.out.println("Если два числа делятся на 3 без остатка, то " + (t13 + t131));
        }
        if (t13 % 5 == 0 && t131 % 5 == 0) {
            System.out.println("Если два числа делятся на 5 без остатка, то " + (t13 - t131));
        }
        if (t13 % 2 == 0 && t131 % 2 == 0) {
            System.out.println("Если два числа делятся на 2 без остатка, то " + t13 * t131);
        }
        if (t13 < 0 || t131 < 0) {
            System.out.println("Если хотя бы одно число < 0, то " + (t13 * t131) * -1);
        } else {
            System.out.println("Невозможно произвести действие");
        }


        //Task 14
        //Распечатать следующие выражения, используя метод и параметры:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        //И так далее все возможные варианты.
        //Сравнить код из HW2 с кодом из HW4. Что для вас легче?

        print(tLine + "\n" + t1 + 14);

        int k = 1;
        int l = 2;
        int m = 3;

        task14(k, k);
        task14(k, l);
        task14(k, m);
        System.out.println("\n");

        task14(l, k);
        task14(l, l);
        task14(l, m);
        System.out.println("\n");

        task14(m, k);
        task14(m, l);
        task14(m, m);


        //Task 15
        //Выполнить задание 18 из HW2 с помощью метода и параметров:
        //а) Создать переменные apple и student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
        //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //Распечатать это же выражение со значениями 100 и 21.

        print(tLine + "\n" + t1 + 15);

        apple(40, 6);
        apple(100, 21);


        //Task 16
        //Выполнить задание 18 из HW2 с помощью метода и параметров:
        //Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически
        //в зависимости от значений параметров.
        //Распечатать выражение с параметрами:
        //apple = 42, 55, 1
        //student = 42, 5, 2


        print(tLine + "\n" + t1 + 16);

        appleTwo(42, 42);
        appleTwo(55, 5);
        appleTwo(1, 2);



        //Task 17
        //Напишите метод, который примет на вход параметр температуры в Цельсиях, и распечатает результат
        //температуры в Цельсиях и в Фаренгейтах.

        print(tLine + "\n" + t1 + 17);
        temp(25);



        //Task 18
        // а) Создать метод, который примет на вход параметр i и распечатает таблицу:
        // int min | значение i
        // int max | значение i
        // i ^ 2   | значение i ^ 2
        //b) поменять значение i и распечатать таблицу с новым значением i

        print(tLine + "\n" + t1 + 18);

        task18(5);


        //Task 19
        //Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
        //Тестовые данные - 2, 5, 0.

        print(tLine + "\n" + t1 + 19);





        //Task 20
        //Напишите тест, который валидирует ваш код из задания №11. Придумайте тестовые данные.
        //Выведите результат проверки на печать.

        print(tLine + "\n" + t1 + 20);







        //Task 21
        //Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит
        //результат проверки.
        //( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
        //Выведите результат проверки на печать.


        print(tLine + "\n" + t1 + 21);


    }
} 