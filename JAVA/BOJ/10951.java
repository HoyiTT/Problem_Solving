import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNextInt()){
      int j = sc.nextInt();
      int k = sc.nextInt();

      System.out.println(j + k);
    }
    sc.close();
  }
}