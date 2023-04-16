import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //                   ПЛАН УРОКА
        // 1. Что такое переменная
        // 2. Для чего нужна переменная
        // 3. Хранение переменных в JAVA
        // 4. Примитивные типы данных
        // 5. Максимальные и минимальные значения
        // 6. Переполнение переменных
        // 7. Ввод данных с консоли
        // 8. Практика(Исправление BMI, калькулятор умножегния)


//        byte b = 123; // целочисленный тип данных(примитивный) занимает 8 бит памяти = 1 байт
//        short s = 12345; // 16 бит = 2 байта
//        char c = 'b'; // принимает в себя какойто символ
//        int i = 123454; // 32 бита =
//        long l = 123423423L; // 64 бита = 8 байт
//
//        float f = 123.3F; // тип данных с плавающей точкой 32 бита (маленькое число с плав. точкой)
//        double d = 12343.3; // 64 бита (большое число с плав. точкой)
//
//        boolean bool = false; // ложь
//        boolean bool1 = true; // правда
//
//        System.out.println(Integer.MAX_VALUE); // максимальное значение
//        System.out.println(Integer.MIN_VALUE);

          // System.out.println("BMI = " + 75 / (1.75 * 1.75));

//        double weight = 75;
//        double height = 1.75;
//
//        System.out.println("BMI = " + weight / (height * height));


//        System.out.println("Введите ваш вес(кг): ");
//        double weight = new Scanner(System.in).nextDouble();
//        System.out.println("Введите ваш рост(метр): ");
//        double height = new Scanner(System.in).nextDouble();

        System.out.println("\t\t***Добро пожаловать в калькулятор умножения чисел!***\n\n");
        System.out.println("Введите первое число:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int b = new Scanner(System.in).nextInt();

        System.out.println(a + " * " + b + " = " + a * b);


    }
}