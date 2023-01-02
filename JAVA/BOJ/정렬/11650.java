import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    
    int[][] arr = new int[k][2];

    for(int a = 0; a < k;a++){
      arr[a][0] = scanner.nextInt();
      arr[a][1] = scanner.nextInt();
    }

    Arrays.sort(arr,(e1,e2) -> {
      if(e1[0] == e2[0]){
        return e1[1] - e2[1];
      } else {
        return e1[0] - e2[0];
      }
      //양수가 나온다 -> 왼쪽 값이 크다
      //음수가 나온다 -> 오른쪽 값이 크다
    });

    for(int n = 0; n < k; n++){
      System.out.println(arr[n][0] + " " + arr[n][1]);
    }
    
    scanner.close();
  }
}