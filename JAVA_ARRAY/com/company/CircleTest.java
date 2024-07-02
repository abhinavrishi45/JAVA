package com.company;


class Circle {

        private final double PI = 3.14159;

        private double radius;


        public Circle() {
            radius = 0.0;
        }

        public Circle(double r) {
            radius = r;
        }

        public void setRadius(double r) {
            radius = r;
        }

        public double getRadius() {
            return radius;
        }
        // method to calculate and return area
        public double getArea() {
            return PI * radius * radius;
        }
    }
    public class CircleTest {

        public static void main(String[] args) {


            Circle circle1 = new Circle();

            Circle circle2 = new Circle(3.5);

            System.out.println("Area of circle for first object circle1 with radius 0="+circle1.getArea());

            System.out.println("Area of circle for second object circle2="+circle2.getArea());

            circle1.setRadius(1.5);

            System.out.println("Area of circle for first object circle1 with radius 1.5="+circle1.getArea());

        }
}
