import java.util.Scanner;

public class Main {
    static int[] array = {1,2,3,4,5,6,7};
    public static void main(String[] args) {
//        for (int i = 0; i < array.length; i++) { // печать массива
//            System.out.println(array[i]);
//        }
        printArray(); // печать массива

//        System.out.println("Введите число: ");
//        int input = new Scanner(System.in).nextInt(); // замена значения через индекс на число от пользователя

        array[2] = inputNumber();

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        printArray(); // печать массива

    }


    public static void printArray() { // МЕТОД ДЛЯ РАСПЕЧАТКИ МАССИВА
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int inputNumber() {
        System.out.println("Введите число:");
//        int input = new Scanner(System.in).nextInt();
//        return input;
        return new Scanner(System.in).nextInt();
    }
}