import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for(int a = 1; a <= t; a++){
      int j = sc.nextInt();
      int k = sc.nextInt();
      
      System.out.println(
        "Case #"+a+": "+ j + " + " + k + " = " + (j + k)); 
    }
    sc.close();
  }
}