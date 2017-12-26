package ua.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {

  public static void main(String[] args) {

    Square s = new Square(5);
    System.out.println("Площадь квадрата " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " = "+ r.area());

  }

}



