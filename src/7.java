import java.util.Random;
class RandomNumber {
public static void main(String[] args) {
Random rand = new Random();
int num = rand.nextInt((10 - 5) + 1) + 5; //Generates a random number between 5 and 10
System.out.println("The randomly generated number is: " + num);
}
}