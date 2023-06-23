import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

//        String s = "123";
//        Integer i = 123;
//
//        String test = String.valueOf(i);// КОНВЕРТИРОВАТЬ ИЗ ЧИСЛА В ТЕКСТ
//        Integer test1 = Integer.parseInt(s); // КОНВЕРТИРОВАТЬ ИЗ СТРОКИ В ЧИСЛО
//        System.out.println(test1 + 1);
//        System.out.println(test + 1);


        String input = new Scanner(System.in).nextLine();

        int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)));
        System.out.println(lastNum);
    }
}
