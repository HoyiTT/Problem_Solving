class Solution {
    public long solution(int a, int b) {
        if(b < a){
            int tmp  = a;
            a = b;
            b = tmp;
        }
        
        long answer = 0;
        
        for(long num1 = a; num1 <= b;num1++){
            answer += num1;
        }
        
        return answer;
    }
}