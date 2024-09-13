package oop1.ex;

public class Rectangle {

    int width;
    int height;

    public void area() {
        int area = width * height;
        System.out.println("넓이:" + area);

    }
    public void perimeter() {
        int perimeter =  2 * (width * height);
        System.out.println("둘레" + perimeter);
    }
    public void isSquare() {
        if (width == height) {
            System.out.println("정사각형");
        } else {
            System.out.println("직사각형");
        }
    }
}
