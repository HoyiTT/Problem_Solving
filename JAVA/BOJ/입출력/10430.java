import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;
    
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    System.out.println((a+b)%c);
    System.out.println(((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c) * (b%c))%c);
    
    
    scanner.close();
  }
}