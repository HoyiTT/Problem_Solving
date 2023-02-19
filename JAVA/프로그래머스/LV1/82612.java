class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int a = 0; a < count;a++){
            sum += price * (a+1);
        }
        if(sum - money < 0) return 0;
        
        else answer = sum - money;
        
        return answer;
    }
}