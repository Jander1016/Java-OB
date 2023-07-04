package Refactor;

import java.util.Arrays;

public class MainRefactor {
  public static void main(String[] args) {
    int[] numbers = {20,30,59,4,99,-8};
    printMaxMin(numbers);

    LargeConstructorBuilder builder = new LargeConstructorBuilder("Fiat")
            .withModel("Sport")
                    .withMotor("Electric")
                            .withDoors(2);

    esOpenJDKJavaInWindows();
  }
  public static void printMaxMin(int[] numbers){
    //Initial:MaxMin
    //int max=0;
    //int min=numbers[0];

    //for(int i=0; i < numbers.length; i++){

      //if(max < numbers[i])max = numbers[i];
      //if(min > numbers[i])min = numbers[i];

      //Refactoring 1
      //max = max < numbers[i] ? numbers[i] : max;
      //min = min > numbers[i] ? numbers[i] : min;

      //Refactoring 2
     // max = Math.max(max, numbers[i]);
     // min = Math.min(min, numbers[i]);
  //}

    //Refactoring 3
    //for (int number : numbers) {
      //max = Math.max(max, number);
      //min = Math.min(min, number);
    //}

    int max = Arrays.stream(numbers).reduce(0,Integer::max);
    int min = Arrays.stream(numbers).reduce(0,Integer::min);
    System.out.println("max: " + max + " min: " + min);
  }

  public static boolean esOpenJDKJavaInWindows(){
    boolean runtimeJDKJava= System.getProperty("java.runtime.name").contains("OpenJDK");
    boolean osVersionJava= System.getProperty("os.version").contains("10.0");

    if(runtimeJDKJava && osVersionJava){
      System.out.println("Es: "+System.getProperty("java.runtime.name") + " version: " + System.getProperty("os.version"));
      return true;
    }
     return false;
  }

}
