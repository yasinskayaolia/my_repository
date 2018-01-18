package ua.conditions;

public class Primes {

  public static boolean isPrime(int n) {
    for(int i = 2; i < n / 2; i = i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}


// for (Начальное значение переменной; Логическое выражение с переменной (условие выполнения цикла); Действие над переменной, после выполнения тела цикла)