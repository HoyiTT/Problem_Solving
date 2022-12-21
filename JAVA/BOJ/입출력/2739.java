import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int k = scanner.nextInt();
    
    for (int j = 1; j <= 9 ; j++){
      System.out.println(k + " * " + j + " = " + (k * j));
    }
  }
}