package ua.conditions;

public class Primes {

  public static boolean isPrime(int n) {
    for(int i = 2; i < n; i = i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
