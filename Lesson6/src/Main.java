import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[10]; // создать массив указав только кол-во элементов в нем
//        int[ people = {12, 13, 12, 12, 2} // создать массив с уже исвестными элементами
//
//        for (int i = 0; i < 10; i++) {  запись элементов в массив через цикл for
//            array[i] = i + 10;
//        }
////        array[0] = 11;
////        array[1] = 12;
////        array[2] = 13;
////        array[3] = 14;
////        array[4] = 15;
//
//
//        for (int i = 0; i < 10; i++) {       печать массива используя цикл (один элемент на строку)
//            System.out.println(array[i]);
//        }

        int[] people = new int[5];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Random().nextInt(100);  // рандомное заполнение массива на кол-во 100
        }
        double summAge = 0;
        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i]);
            summAge += people[i];  // summAge = summAge + people[i]
        }
        System.out.println("Средний возраст: " + summAge/people.length);




    }
}