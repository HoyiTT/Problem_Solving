import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    int [] num = new int[k];

    for (int a = 0; a < k; a++){
      num[a] = scanner.nextInt();
    }

    scanner.close();

    Arrays.sort(num);
      
    System.out.println(num[0] + " " + num[k - 1]);
  }
}