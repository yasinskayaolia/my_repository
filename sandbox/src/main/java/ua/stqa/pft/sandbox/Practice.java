package ua.stqa.pft.sandbox;

public class Practice {

  // даный класс имеет два поля:
  int a;
  int b;
 // создаем метод
  void setAB (int a, int b) {

    // в теле метода присваем переменной a - x, b -y
    this.a = a;                                             //(когда мы ставим здесь this, мы говорим, что работать надо с этими полями )
    this.b = b;
    System.out.println("a = " + a + " b = " + b);
    }

    public static void main (String[] args) {

    // обьявляем переменную типа Practice
      Practice t = new Practice();
      t.setAB(1, 2);
      System.out.println("a = " + t.a + " b = " + t.b);
    }
}
