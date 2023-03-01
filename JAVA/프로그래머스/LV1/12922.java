class Solution {
    public String solution(int n) {
        String answer = "";
        if(n % 2 == 0){
            for(int a =0; a < (n/2); a++){
                answer = answer + "수박";
            }
        }else{
            for(int a =0; a < (n/2); a++){
                answer = answer + "수박";
            }
            answer = answer + "수";
        }
        return answer;
    }
}