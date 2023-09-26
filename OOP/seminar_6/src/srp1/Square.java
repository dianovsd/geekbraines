package srp1;

import java.util.ArrayList;
import java.util.List;

public class Square {

    public void draw(){
        for (int i = 0; i < side * 2; i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < side; i++){
            System.out.print("*");
            for (int j = 1; j < side ; j++){
                System.out.print("    ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i < side * 2; i++){
            System.out.print("* ");
        }
        System.out.println();
    }

    public int getArea(){
        return side * side;
    }

    public Square(Point point1, int side) {
        this.side = side;
        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);
        points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getSide() {
        return side;
    }

    private List<Point> points;
    private int side;



}
