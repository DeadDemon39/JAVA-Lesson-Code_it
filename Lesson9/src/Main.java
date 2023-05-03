public class Main {
    public static void main(String[] args) {
        Human vasya = new Human();
        vasya.age = 51;
        vasya.name = "Вася";
        vasya.gender = "m";
        vasya.walk(10);

        System.out.println("Имя - " + vasya.name + "\n" + "Возраст - " + vasya.age + "\n" + "пол - " + vasya.gender);

        System.out.println();

        Human petya = new Human();
        petya.age = 13;
        petya.name = "Петя";
        petya.gender = "f";
        petya.walk(20);

        System.out.println("Имя - " + petya.name + "\n" + "Возраст - " + petya.age + "\n" + "пол - " + petya.gender);

        System.out.println();

        Human alex = new Human("Александр", "m", 33);
        alex.walk(15);
        System.out.println("Имя - " + alex.name + "\n" + "Возраст - " + alex.age + "\n" + "пол - " + alex.gender);
    }
}