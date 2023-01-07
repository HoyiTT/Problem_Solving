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
    dp[0] = seq[0];
    int big = dp[0];
    for(int b = 1; b < k;b++){
      //이미 dp[0]은 넣어주었음으로 1부터 시작
      for(int c = 0; c< b; c++){
        if(seq[b] > seq[c]){
          //b의 값이 c보다 크다면
          dp[b] = Math.max(dp[b], dp[c]+seq[b]);
          //b + C와 이전 반복문에서 연산한 dp[b]와 비교
        }
      }
      big = Math.max(big,dp[b]);
      //최대값을 저장
    }
   
    System.out.println(big);
    scanner.close();
  }
}