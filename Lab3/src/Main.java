import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cell obj1 = new Cell(2, 5, 5, 5);
        Cell obj2 = new Cell(13, 12, 5, 5);
        Circle circle1 = new Circle(7, 5, 5);
        boolean contain1 = circle1.contains(obj1);
        boolean contain2 = circle1.contains(obj2);


        if (contain1) {
            System.out.println("Клетка с кординатами " + obj1.getDistanceToCenter() + " и расстоянием размером по х и у соответсвенно " + obj1.getX() + " " + obj1.getY());
            System.out.println("Внутри круга");
        } else {
            System.out.println("Клетка с кординатами " + obj1.getDistanceToCenter() + " и расстоянием размером по х и у соответсвенно " + obj1.getX() + " " + obj1.getY());
            System.out.println("Не внутри круга");
        }
        if (contain2) {
            System.out.println("Клетка с кординатами " + obj2.getDistanceToCenter() + " и расстоянием размером по х и у соответсвенно " + obj2.getX() + " " + obj2.getY());
            System.out.println("Внутри круга");
        } else {
            System.out.println("Клетка с кординатами " + obj2.getDistanceToCenter() + " и расстоянием размером по х и у соответсвенно " + obj2.getX() + " " + obj2.getY());
            System.out.println("Не внутри круга");
        }
    }
}

class Cell implements Comparable<Cell> {
    private int x;
    private int y;
    private double distanceToCenter;

    public Cell(int x, int y, double centerX, double centerY) {
        this.x = x;
        this.y = y;
        this.distanceToCenter = Math.sqrt(Math.pow(centerX - x, 2) + Math.pow(centerY - y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistanceToCenter() {
        return distanceToCenter;
    }

    @Override
    public int compareTo(Cell o) {
        return Double.compare(distanceToCenter, o.distanceToCenter);
    }

}


class Circle {
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(int radius, int centerX, int centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public boolean contains(Cell cell) {
        return Math.pow(centerX - cell.getX(), 2) + Math.pow(centerY - cell.getY(), 2) < Math.pow(radius, 2);
    }
}

