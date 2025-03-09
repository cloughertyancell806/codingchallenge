import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("A random number between 0 and 9 is: " + randomNumber);
    }
}
