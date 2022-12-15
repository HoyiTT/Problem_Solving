import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String sentence = scanner.nextLine();

    int j = sentence.length() / 10;
    int k = sentence.length() % 10;

    for (int a = 0; a < j; a++){
      String sub = sentence.substring((0 + (a * 10)),10 + (a * 10));
      System.out.println(sub);
    }
    if ( k != 0){
      String remainder = sentence.substring(10 * j , (10 * j + k));
      System.out.println(remainder);
    }
  }
}