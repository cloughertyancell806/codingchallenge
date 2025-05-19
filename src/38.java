public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example: Generate some random numbers between 1 and 10
        System.out.println("Random number between 1 and 10:");
        System.out.println(Math.random() * 10);

        // Another example: Generate a list of random numbers between -5 and 5
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = -5; i <= 5; i++) {
            if (i < 0) {
                continue;
            }
            int randomNumber = Math.random() * 10;
            if (randomNumber > 7) {
                break;
            }
            randomNumbers.add(randomNumber);
        }
        System.out.println("Random numbers between -5 and 5:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
}
