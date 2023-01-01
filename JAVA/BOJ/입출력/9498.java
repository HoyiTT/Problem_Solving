import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    
    if(k >= 90){
      System.out.println("A");
    } else if(90 > k && k >= 80){
      System.out.println("B");
    } else if(80 > k && k >= 70){
      System.out.println("C");
    } else if(70 > k && k >= 60){
      System.out.println("D");
    } else{
      System.out.println("F");
    }
    
    scanner.close();
  }
}