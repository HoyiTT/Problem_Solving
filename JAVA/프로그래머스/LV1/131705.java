class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int a = 0; a < number.length; a++) {
            for(int b = a + 1; b < number.length;b++){
                for(int c = b + 1; c < number.length;c++){
                    if(number[a] + number[b] + number[c] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}