public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example: Generate a random number between 1 and 100
        int randomNumber = (int)(Math.random() * 100);
        System.out.println("Random Number: " + randomNumber);

        // Another example: Generate a string with a random character from the set of lowercase letters 'a' to 'z'
        String randomString = "abcdefgh";
        Random random = new Random();
        char randomChar = (char) random.nextInt(randomString.length());
        System.out.println("Random Character: " + randomChar);
    }
}
