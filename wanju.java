import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. Participant 해시 값을 넣어주기
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant) map.put(player, map.getOrDefault(player,0)+1);
        // 2. Completion 해시 값을 빼주기
        for(String player : completion) map.put(player, map.get(player) - 1);
        // 3. value 가 0이 아닌 키를 반환
        for(String key : map.keySet()){
            if(map.get(key)!=0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}
