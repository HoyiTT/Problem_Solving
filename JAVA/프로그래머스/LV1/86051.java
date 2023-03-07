class Solution {
    public int solution(int[] numbers) {
        
        int answer = 45;
        for(int a = 0; a <numbers.length;a++){
            answer -= numbers[a];
        }
        return answer;
    }
}