package ua.stqa.pft.sandbox;

public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    double h = a;
    double w =b;
  }

  public double area() {
    return this.a * this.b;
  }
}