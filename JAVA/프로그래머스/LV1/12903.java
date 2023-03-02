class Solution {
    public String solution(String s) {
        String answer = "";
        if((s.length() % 2) != 0){
            int a = s.length() / 2;
            answer = answer + s.substring(a,a + 1);
        }else{
            int a = s.length() / 2;
            answer = answer + s.substring(a - 1,a + 1);
        }
        
        return answer;
    }
}