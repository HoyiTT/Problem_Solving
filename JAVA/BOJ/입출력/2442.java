import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for (int b = 0; b < k; b++){
      for (int c = 1; c < k - b; c++){
        System.out.print(" ");
      }
      for (int a = 1; a < (2 * (b + 1)); a++){
        System.out.print("*");
      }
    System.out.println();
    }

    scanner.close();
  }
}