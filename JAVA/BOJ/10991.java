import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    
    for(int a = 1; a <= k; a++){
      for(int b = 1;b <= k - a; b++){
        System.out.print(" ");
      }
      for(int j = 1; j <= a * 2 - 1; j++){
        if( j % 2 == 1){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    scanner.close();
  }
}