import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();

    for(int tr = 0; tr < k; tr++){
      //입력받은 횟수 만큼 계산

      int row = 2;
      int col = scanner.nextInt();
      //열의 길이 입력
      
      int[][] dt = new int[row][col];
      //입력받을 행렬을 저장하기 위한 임시 배열 선언
      
      for(int a = 0; a < row; a++){
        for(int b = 0; b < col;b++){
          dt[a][b] = scanner.nextInt();
        }
      }
      //임시 배열에 값 저장

      // for(int a = 0; a < row; a++){
      //   for(int b = 0; b < col;b++){
      //     System.out.print(dt[a][b] + " ");
      //   }
      //   System.out.println();
      // }

      int[][] dp = new int[row + 1][col + 1];
      //연산을 위한 dp 베열 선언
      dp[1][1] = dt[0][0];
      dp[2][1] = dt[1][0];
      dp[1][0] = 0;
      dp[2][0] = 0;

      
      for(int c = 2; c < col + 1; c++){
        dp[0][c - 1] = Math.max(dp[1][c - 2],dp[2][c - 2]);
        dp[1][c] = Math.max(dp[0][c - 1] + dt[0][c - 1], dp[2][c - 1] + dt[0][c - 1]);
        dp[2][c] = Math.max(dp[0][c - 1] + dt[1][c - 1], dp[1][c - 1] + dt[1][c - 1]);      
      }

      // for(int a = 0; a < row + 1; a++){
      //   for(int b = 0; b < col + 1;b++){
      //     System.out.print(dp[a][b] + " ");
      //   }
      //   System.out.println();
      // }
      
      //3 x n 배열로 만들어 값 저장 
      
      System.out.println(Math.max(dp[1][col],dp[2][col]));
      //계산된 값 중 최대값 출력
    
    }
    scanner.close();
  }
}