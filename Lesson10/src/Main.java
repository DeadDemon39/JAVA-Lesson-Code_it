public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.x = 0;
        robot.y = 0;

        robot.move(0, 5);

        System.out.println("Второе перемещение");

        robot.move(5, 10);
    }
}