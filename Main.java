package ClassesObjects;

class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circle {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.printShape();
        s.printSquare();
    }
}
