class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        
        arr[0] = 0;
        arr[1] = 1;
        
        for(int a = 2; a <= n;a++){
            arr[a] = (arr[a-1] +arr[a-2]) % 1234567;
        }
        
        answer = arr[n];
        
        return answer;
    }
}