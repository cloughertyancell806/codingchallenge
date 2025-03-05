import java.util.Random;
public class RandomCode {
  public static void main(String[] args) {
    System.out.println("This is a random string: " + getRandomString());
    System.out.println("This is a random number: " + getRandomNumber());
  }

  private static String getRandomString() {
    Random random = new Random();
    int length = random.nextInt(10) + 5; // string length between 5 and 15
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append((char)(random.nextInt(26) + 'a'));
    }
    return sb.toString();
  }

  private static int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(100);
  }
}