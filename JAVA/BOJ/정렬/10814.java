import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    
    String[][] arr = new String[k][2];
    

    for(int a = 0; a < k;a++){
      arr[a][0] = scanner.next();
      arr[a][1] = scanner.next();
    }

    Arrays.sort(arr,(e1,e2) -> {
      return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
    });

    for(int n = 0; n < k; n++){
      System.out.println(arr[n][0] + " " + arr[n][1]);
    }
    
    scanner.close();
  }
}