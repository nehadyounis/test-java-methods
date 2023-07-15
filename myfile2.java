import java.io.*;

public class Main {
  static void myAge(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myAge("Liam", 5);
    myAge("Jenny", 5);
    myAge("Anja", 8);
  }
}
