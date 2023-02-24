class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int a = 0; a < seoul.length;a++){
            if(seoul[a].equals("Kim")){
                answer = "김서방은 " + a + "에 있다";
            }
        }
        return answer;
    }
}