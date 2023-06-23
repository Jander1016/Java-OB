package io;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try {
      //Create file test.txt and write a text input file
      PrintStream out = new PrintStream("test.txt");
      out.println("test of create file");
      out.close();

      //Copy file to file

      InputStream inStream= new FileInputStream("C:\\OPEN BOOTCAMP\\Java-Basic\\test.txt");
      byte[] buffer=inStream.readAllBytes();
      for (byte dataPath : buffer) {
        System.out.print((char)dataPath);
      }
      inStream.close();

      PrintStream outStream= new PrintStream("main.txt");
      outStream.write(buffer);
      outStream.close();

    } catch (FileNotFoundException ffe) {
      System.out.println(ffe.getMessage());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
  void useScanner(){
    boolean ok = false;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter two numbers:");
      try{
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ok = true;
        System.out.println(a+b);
      }catch(InputMismatchException ie){
        System.out.println("Invalid numbers");
      }
    }while(!ok);
  }
  void useBufferedInputStream(){
    try {
      InputStream path= new FileInputStream("C:\\OPEN BOOTCAMP\\Java-Basic\\input-output\\src\\io\\Main.java");
      BufferedInputStream pathBuffer= new BufferedInputStream(path);
      try {
        //All ready bytes
        // byte[] data= pathBuffer.readAllBytes();
        // for (byte dataPath : data) {
        //   System.out.print((char)dataPath);
        // }

        //byte x byte
        int data = pathBuffer.read();
        while (data != -1) {
          System.out.print((char)data);
          data = pathBuffer.read();
        }


      }catch (IOException e) {
        System.out.println(e.getMessage());
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
  void useInputStream(){
    try {
      InputStream path= new FileInputStream("C:\\OPEN BOOTCAMP\\Java-Basic\\input-output\\src\\io\\Main.java");
      try {
        //All ready bytes
        byte[] data= path.readAllBytes();
        for (byte dataPath : data) {
          System.out.print((char)dataPath);
        }

        //byte x byte
        // int data = path.read();
        // while (data != -1) {
        //   System.out.print((char)data);
        //   data = path.read();
        // }


      }catch (IOException e) {
        System.out.println(e.getMessage());
      }
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
