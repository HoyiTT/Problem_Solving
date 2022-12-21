import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for(int a = 0; a < t; a++){
      String[] na = sc.next().split(",");
      System.out.println(
        Integer.parseInt(na[0])+Integer.parseInt(na[1]));
    }
    sc.close();
  }
}