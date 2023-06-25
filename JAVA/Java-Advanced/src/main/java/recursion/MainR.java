package recursion;

import java.util.stream.IntStream;

public class MainR
{
  public static void main(String[] args) {
    /*System.out.println(sumIterative(10));
    System.out.println(sumRecursion(10));
    System.out.println(sumFunctional(10));

    System.out.println(factorialIterative(5));
    System.out.println(factorialRecursive(5));
    System.out.println(factorialFunctional(5));
*/
    long timeInitiated = System.currentTimeMillis();
    for (int i = 0; i <= 10000000; i++) {
      factorialIterative(100);
    }
    long timeOut = System.currentTimeMillis();
    System.out.println("Time Ms total: " + (timeOut - timeInitiated));

  }

  public static int sumIterative(int number){
    int total= 0;

    for (int i = 1; i <= number; i++) {
      total += i;
    }

    return total;
  }
  public static int sumRecursion(int num){
    if (num == 1) return 1;
    return num + sumRecursion(num - 1);
  }

  public static int sumFunctional(int nro) {
    //return IntStream.rangeClosed(0, nro).reduce(0, (a,b)-> a + b));
    return IntStream.rangeClosed(0, nro).reduce(0, Integer::sum);
  }
  public static int factorialIterative(int nro){
    int result = 1;
    for (int i = 1; i <= nro; i++) {
      result *= i;
    }
    return result;
  }

  public static int factorialRecursive(int num){
    if(num == 1) return 1;
    return num * factorialRecursive(num-1);
  }
  public static int factorialFunctional(int num){
    return IntStream.rangeClosed(1, num).reduce(1, (a,b)-> a * b);
  }

}
