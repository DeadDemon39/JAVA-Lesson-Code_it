public class Duck {

    String name;
    int age;
    String color;
    static int footCount; // static означает что переменная одна для всех объектов

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly() {
        System.out.println(color + " утка по кличке " + name + " улетела в теплые края с " + footCount + " Ногами");
    }
    static void fly(int footCount) {
        Duck.footCount = footCount;
    }
}
