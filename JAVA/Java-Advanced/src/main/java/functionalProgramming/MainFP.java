package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainFP {
  public static void main(String[] args) {
    System.out.println(toCapitalLetters.apply("hello, world!"));
    System.out.println(sumNumber.apply(5));
    greet(toCapitalLetters, "alexander");

    ArrayList<String> listNames = new ArrayList<>();
    listNames.add("Julia");
    listNames.add("Kiara");
    listNames.add("Isabella");
    listNames.add("Anyi");
    listNames.add("Raquel");

    listNames.stream().forEach(System.out::println);

    Stream<String> listStream = listNames.stream().map(String::toUpperCase);
    listStream.forEach(System.out::println);

    int[] listNumbers = {1,2,3,4,5,6,7,8,9,10};

    var stNumbers = Arrays.stream(listNumbers);
    var result = stNumbers.filter(x -> x % 2 == 0).reduce(0,(a,b) -> {
      System.out.println("a is: "+ a +" & b is: " + b + " Total is: " + (a+b));
      return a +b;
    });
    System.out.println(result);
  }

  //Pure Function
  public static int sum(int a, int b) {
    return a + b;
  }

  //High Order Functions
  //private static final Function<String ,String> toCapitalLetters = x -> x.toUpperCase();
  private static final Function<String,String> toCapitalLetters = String::toUpperCase;
  private static final Function<Integer, Integer> sumNumber = x-> x + x;

  public static void greet(Function<String,String> myFunction, String myName) {
    System.out.println(myFunction.apply("Hello " + myName));
  }


}
