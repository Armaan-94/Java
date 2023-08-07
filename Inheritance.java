

class Shape {
    void shapeMethod() {
        System.out.println("This is shape.");
    }}

    class Circle extends Shape {
        void circleMethod() {
            System.out.println("This is circular shape.");
        }
    }

    class Rectangle extends Shape {
        public void rectangleMethod() {
            System.out.println("This is rectangular shape.");
        }
    }

    class Square extends Rectangle {
        void squareMethod() {
            System.out.println("Square is a rectangle.");
        }
    }

public class Inheritance{
    public static void main(String[] args) {
        Square myObj = new Square();
        myObj.shapeMethod();
        myObj.rectangleMethod();

    }
 }
