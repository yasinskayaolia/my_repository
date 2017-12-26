package ua.stqa.pft.sandbox.PointsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.stqa.pft.sandbox.Point;

import static ua.stqa.pft.sandbox.Point.distance;


public class PoitsTests {

  @Test

  public void PoitsP1P2() {
    Point p1 = new Point(4, 5);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(distance(p1, p2), 2.8284271247461903);
  }

  @Test
  public void testDistanceqP2() {
    Point p1 = new Point(4, 5);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.distance(p2), 2);
  }

}
