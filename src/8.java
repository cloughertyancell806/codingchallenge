public class RandomNumberGenerator {
  public static void main(String[] args) {
    int upperBound = 10;
    int lowerBound = 1;
    int randomNumber = (int)(Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
    System.out.println("Random number: " + randomNumber);
  }
}
