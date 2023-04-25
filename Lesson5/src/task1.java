import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        boolean isContinue = true;

        int x = 0;
        int y = 0;

        while (isContinue) {
            System.out.println("Выберите куда двинуться:\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
            int input = new Scanner(System.in).nextInt();

            if(input == 1) {
                y++; // ИНКРЕМЕНТ
            } else if (input == 2) {
                y--; // ДИКРЕМЕНТ
            } else if (input == 3) {
                x++;
            } else if (input == 4) {
                x--;
            }
            else {
                System.out.println("Error");
                isContinue = false;
            }
            System.out.println("Координаты робота: по вертикали " + y + ", по горизонтали " + x);
        }

    }
}
