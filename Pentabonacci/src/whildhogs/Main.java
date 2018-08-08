package whildhogs;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(countOddPentaFib(10));


        double side = 1.1234;
        double radius = 1.1234;
        double base = 5;
        double height = 2;



        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Square(side));
        shapes.add(new Circle(radius));
        shapes.add(new Triangle(base, height));

        Collections.sort(shapes);

    }
    public static long countOddPentaFib(long n) {
        if (n < 5 && n > 0){
            return 1;
        }
        int counter = 1;
        long[] array = new long[(int) n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        array[3] = 2;
        array[4] = 4;
        for (int i = 5; i < n+1; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3] + array[i-4] +array[i-5];
            if (array[i]%2 != 0) {
                counter ++;
            }
        }
        Arrays.stream(array).forEach(System.out::println);
        return counter;
    }
}

class Shape implements Comparable<Shape>{
    double area;

    public double getArea() {
        return area;
    }


    @Override
    public int compareTo(Shape o) {
        return Double.compare(area, o.area);
    }
}
class Square extends Shape{
    public Square(double side){
        this.area = side*side;
    }
}
class CustomShape extends Shape{
    public CustomShape(double area){
        this.area = area;
    }
}
class Rectangle extends Shape{
    public Rectangle(double width, double height){
        this.area = width*height;
    }
}
class Triangle extends Shape{
    public Triangle(double base, double height){
        this.area = base*height/2;
    }
}
class Circle extends Shape{
    public Circle(double radius){
        this.area = Math.PI*radius*radius;
    }
}