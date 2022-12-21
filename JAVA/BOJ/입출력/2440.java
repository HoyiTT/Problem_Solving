import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for (int b = k; b > 0; b--){
      for (int a = 0; a < b; a++){
        System.out.print("*");
      }
    System.out.println();
    }

    scanner.close();
  }
}