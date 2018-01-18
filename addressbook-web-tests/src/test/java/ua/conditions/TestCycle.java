package ua.conditions;

public class TestCycle {


  public static void main(String[] args) {
    int i;
        for(i = 3; i < 3; i++ ) {
      System.out.println("Cycle " + i++);
    }
  }
}
