public class RandomCodeGenerator {
    private static final int MAX_NUMBER = 10;
    private static final long[] numbers = new long[MAX_NUMBER];

    public void generateNumbers() {
        for (int i = 0; i < MAX_NUMBER; i++) {
            numbers[i] = i * 2 + 5; // Example: Generate random numbers between 5 and 15
        }
    }

    public static void main(String[] args) {
        RandomCodeGenerator generator = new RandomCodeGenerator();
        generator.generateNumbers(); // Call the method to generate numbers
    }
}
