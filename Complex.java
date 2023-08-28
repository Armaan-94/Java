package ClassesObjects;

    import java.util.Scanner;

    public class Complex {
        private double real;
        private double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex add(Complex other) {
            double realPart = this.real + other.real;
            double imaginaryPart = this.imaginary + other.imaginary;
            return new Complex(realPart, imaginaryPart);
        }

        public Complex subtract(Complex other) {
            double realPart = this.real - other.real;
            double imaginaryPart = this.imaginary - other.imaginary;
            return new Complex(realPart, imaginaryPart);
        }

        public Complex multiply(Complex other) {
            double realPart = this.real * other.real - this.imaginary * other.imaginary;
            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(realPart, imaginaryPart);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter real part of first complex number: ");
            double real1 = sc.nextDouble();

            System.out.print("Enter imaginary part of first complex number: ");
            double imaginary1 = sc.nextDouble();

            Complex num1 = new Complex(real1, imaginary1);

            System.out.print("Enter real part of second complex number: ");
            double real2 = sc.nextDouble();

            System.out.print("Enter imaginary part of second complex number: ");
            double imaginary2 = sc.nextDouble();

            Complex num2 = new Complex(real2, imaginary2);

            Complex sum = num1.add(num2);
            Complex difference = num1.subtract(num2);
            Complex product = num1.multiply(num2);

            System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
            System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
            System.out.println("Product: " + product.real + " + " + product.imaginary + "i");
            sc.close();
        }
    }

