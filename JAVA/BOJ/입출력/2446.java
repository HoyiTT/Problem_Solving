import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for(int i = k; i > 0; i--){
      for(int a = 1;  a <= k - i ; a++){
        System.out.print(" ");
      }
      for(int b = 1; b <= 2 * i -1; b++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = 2; i <= k; i++){
      for(int a = 1;  a <= k - i ; a++){
        System.out.print(" ");
      }
      for(int b = 1; b <= 2 * i -1; b++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    scanner.close();
  }
}