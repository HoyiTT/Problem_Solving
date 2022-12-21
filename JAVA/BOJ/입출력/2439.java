import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for (int b = 0; b < k; b++){
      for (int c = 0; c < k - b - 1; c++){
        System.out.print(" ");
      }
      for (int a = 0; a < b + 1; a++){
        System.out.print("*");
      }
    System.out.println();
    }

    scanner.close();
  }
}