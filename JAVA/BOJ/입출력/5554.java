import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int k = 0;
    
    for(int a = 0; a<4; a++){
      k += scanner.nextInt();
    }


    System.out.println(k / 60);
    System.out.println(k % 60);

    
    scanner.close();
  }
}