package lastexercises;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {

    // useArrayUnidimensional();

    // useArrayBidimensional();

    //String wordReversed = reverse("Hello, world!");
    //System.out.println(wordReversed);

    // useVector();
    //useArrayList();
    //useException();
    useInputStream();
  }
  public static String reverse(String text) {
    String textReversed = "";
    for (int i = 1; i <= text.length() ; i++) {
      textReversed += text.charAt(text.length() - i);
    }
    return textReversed;
  }
  static void useArrayUnidimensional() {
    String[] names = {"Julia", "Isabella", "Mayo"};
    for (String name : names) {
      System.out.println(name);
    }
  }
  static void useArrayBidimensional() {
    int[][] numbers = new int[2][4];
    numbers[0][0]=10;
    numbers[0][1]=20;
    numbers[0][2]=30;
    numbers[0][3]=140;
    numbers[1][0]=60;
    numbers[1][1]=25;
    numbers[1][2]=32;
    numbers[1][3]=69;

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Position: " + i);
      for (int j = 0; j < numbers[i].length; j++) {
        System.out.println("Value: " + numbers[i][j]);
      }
    }
  }
  static void useVector(){
    Vector<String> v = new Vector<>();

    v.add("Karin");
    v.add("Mulan");
    v.add("Carlo");
    v.add("Yolanda");
    v.add("Robert");
    v.add("Yuli");

    v.remove(1);
    v.remove(2);

    System.out.println(v);
  }

  static void useArrayList(){
    ArrayList<String> data = new ArrayList<>();

    data.add("Karin");
    data.add("Mulan");
    data.add("Carlo");
    data.add("Yolanda");

    LinkedList<String> list = new LinkedList<>(data);

    for (String key : list) {
      System.out.println(key);
    }

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> listNumbers = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      numbers.add(i);
      if(i % 2 != 0) listNumbers.add(i);
    }
    System.out.println(numbers);
    System.out.println(listNumbers);
  }

  static void useException(){
    try{
      int number1= 10;
      int number2 = 0;

      int result= number1/number2;

      System.out.println(result);

    }catch (ArithmeticException ae){
      System.out.println("Esto no puede hacerse");
    }
  }

  static void useInputStream(){
    try {
      InputStream fileIn = new FileInputStream("C:\\CLARO\\IMPORTANTE\\Servicios Dedicados.pdf");
      byte[] data = fileIn.readAllBytes();
      fileIn.close();

      PrintStream fileOut= new PrintStream("C:\\CLARO\\IMPORTANTE\\dedicated.pdf");
      fileOut.write(data);
      fileOut.close();

    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

}
