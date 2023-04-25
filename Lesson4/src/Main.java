import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Первая: ");
//         int a = new Scanner(System.in).nextInt();
//        System.out.println("Вторая: ");
//         int b = new Scanner(System.in).nextInt();
//
//         if (a > 5 && b < 5) {
//             System.out.println("Hello World");
//         }
//         if (a < 5 && b > 5) {
//             System.out.println("Goodbye");
//         }
//
//    }
//}


public class Main {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snikkersPrice = 100;
        int bonAquaPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Введите кол-во денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();


        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить твикс!");
            isCanBuy = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить марс!");
            isCanBuy = true;
        }
        if (moneyAmount >= snikkersPrice) {
            System.out.println("Вы можете купить сниккерс!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить бонакву!");
            isCanBuy = true;
        }

        if (isCanBuy == false) {
            System.out.println("Недостаточно средств!");
        }
    }
}