package Interfaces;

interface GeometricObject {
 void getPerimeter();
 void getArea();
}
class Circle implements GeometricObject {
    double radius;
  Circle() {
 radius = 1.0;
  }  
 public void getPerimeter() {
   double P;
P = 3.14 * 2 * radius;
 System.out.println("Perimeter of circle is " + P);
    }
  public void getArea() {
        double A;
        A = 3.14 * radius * radius;
        System.out.println("Area of circle is " + A);
    }
}
interface Resizable {
    void resize();
}
class ResizableCircle extends Circle implements Resizable {
    ResizableCircle() {
        super();
    }
      public void resize() {
        int percent = 10;
        double P = 3.14 * 2 * radius * (1 + percent / 100.0);
        double A = 3.14 * radius * radius * (1 + percent / 100.0);
        System.out.println("New perimeter is " + P);
        System.out.println("New area is " + A);
    }
}
class Main3 {
    public static void main(String[] args) {
        ResizableCircle bb = new ResizableCircle();

        bb.getPerimeter();
        bb.getArea();
        bb.resize();
    }
}
