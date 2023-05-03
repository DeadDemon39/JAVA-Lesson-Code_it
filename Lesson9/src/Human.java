public class Human {
    String name;
    String gender;
    int age;

    public Human() {

    }
    public Human(String humaName, int humanAge) {
        name = humaName;
        age = humanAge;
    }
    public Human(String name, String gender, int age) {
        this.name = name; // this.это присвоить значение именно переменной класса!!!!!!!!!!! ВАЖНО!!!!!
        this.gender = gender;
        this.age = age;
    }

    public void walk(int stepsCount) {
        System.out.println(name + " Прошел " + stepsCount +" шагов");
    }

}
