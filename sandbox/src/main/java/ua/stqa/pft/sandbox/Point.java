package ua.stqa.pft.sandbox;


public class Point {

  private double x;
  private double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double plane() {
    return this.x + this.y;
  }

  public static void main(String[] args) {

    Point p1 = new Point(4, 5);
    Point p2 = new Point(2, 3);
    System.out.println("Distance between two points p1(" + p1.x + ", " + p1.y + ") and p2(" + p2.x + ", " + p2.y + ") is " + distance(p1, p2));
    System.out.println("Distance between two points p1(" + p1.x + ", " + p1.y + ") and p2(" + p2.x + ", " + p2.y + ") is " + p1.distance(p2));

  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
  }
  public double distance(Point p2) {
    return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
  }

}


