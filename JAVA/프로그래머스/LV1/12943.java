class Solution {
    public int solution(int num) {
        
        long num1 = num;
        
        for(int answer = 1; answer <= 500; answer++){
            if(num1 == 1){
                return answer -1;
            }
            num1 = (num1 % 2 == 0) ? num1 / 2: num1 * 3 + 1;
        }
        return -1;
    }
}