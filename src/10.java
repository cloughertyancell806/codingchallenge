import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = "";
    for (int i = 0; i < num; i++) {
      if (i == num - 1) {
        str += "CodingChallenge";
      } else {
        str += "CodingChallenge ";
      }
    }
    System.out.println(str);
  }
}
