class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int a  = 0; a < absolutes.length; a++){
            if(signs[a] == true){
                answer += absolutes[a];
            } else {
                answer -= absolutes[a];
            }
        }
        return answer;
    }
}