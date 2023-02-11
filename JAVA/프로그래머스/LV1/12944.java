class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int a = 0; a < arr.length;a++){
            answer+=arr[a];
        }
        answer = answer / arr.length;
        return answer;
    }
}