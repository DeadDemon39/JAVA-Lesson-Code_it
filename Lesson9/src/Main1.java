public class Main1 {
    public static void main(String[] args) {

        Duck duck1 = new Duck("кря", 11, "серая");
        duck1.footCount = 2;
        Duck duck2 = new Duck("Гуля", 2, "Зеленая");

        duck1.fly();
        duck2.fly();
    }
}
