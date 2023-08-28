package ClassesObjects;

public class Triangle {

        int a, b, c;

        public Triangle() {
            a = 3;
            b = 4;
            c = 5;
        }

        public int getPerimeter() {
            return a + b + c;
        }

        public double getArea() {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }


