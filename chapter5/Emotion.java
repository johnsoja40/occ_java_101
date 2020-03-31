/*
   name:       Jamie Johnson
   Assignment: Emotion
   Problem:    laugh or cry - methods
*/

public class Emotion
{

  static void laugh(String name, int age)
  {
    System.out.println("ha ha ha! You're funny " + name + "and you're how fucking old ? " + age);
  }

  static void cry()
  {
    System.out.println("waa waa waa");
  }

  public static void main(String args[])
  {
    String name = "jamie";
    int age = 35;
    laugh(name, age);
    cry();
  }
}
