import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfShapes = scanner.nextInt();
    for (int i = 0; i < numberOfShapes; i++) {
      String shapeName = scanner.next();
      double length = scanner.nextDouble();
      double width = scanner.nextDouble();
      if (shapeName.equals("square")) {
        System.out.println(Math.pow(length, 2));
      } else if (shapeName.equals("rectangle")) {
        System.out.println(length * width);
      } else if (shapeName.equals("circle")) {
        System.out.println((3.14 * Math.pow(length, 2)));
      } else {
        System.out.println("Invalid shape");
      }
    }
  }
}
