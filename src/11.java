import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(100);
    System.out.println(num);
  }
}