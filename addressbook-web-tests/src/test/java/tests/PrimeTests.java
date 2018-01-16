package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.conditions.Primes;

public class PrimeTests {


  @Test
  public void testPrimes() {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }
}
