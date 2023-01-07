import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int k = scanner.nextInt();
    
    int[] seq = new int[k];
    int[] dp = new int[k];
    //seq는 입력값들을 저장하는 배열
    //dp는 수열 길이는 저장하는 배열
    
    for(int a = 0; a < k; a++){
      seq[a] = scanner.nextInt();
    }

    for(int b = 0; b < k;b++){
      dp[b] = 1;
      //배열의 값들은 모두 1 이상이기에 1을 기본값으로 넣어준다.
      
      for(int c = 0; c< b; c++){
        if(seq[b] > seq[c] && dp[b] < dp[c] + 1){
          dp[b] = dp[c] + 1;
        }
        //b번째 원소가 c번째 원소보다 크지만 수열의 길이가 c + 1 보다 작은 경우 c + 1 한 값을 넣어준다. 
      }
    }

    int max = 0;
    
    for(int d = 0; d < k; d++){
      max = dp[d] > max ? dp[d] : max;
    }
    //삼항연산자를 이용 최대값을 구한다.
    
    System.out.println(max);

    scanner.close();
  }
}