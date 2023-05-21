public class Robot {
    int x;
    int y;

//    public Robot(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return  y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void move(int x, int y) {
//        while (this.x < x) {
//            System.out.println("Двигаемся по оси х от " + this.x + "до" + (++this.x));
//        }

//        while (this.y < y) {
//            System.out.println("Двигаемся по оси y от " + this.y + "до" + (++this.y));
//        }
        this.x = print(this.x, x, "x");
        this.y = print(this.y, y, "y");
    }

    public int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигаемся по оси  " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }
}
