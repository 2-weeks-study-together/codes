import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // HashSet 생성
        HashSet<Integer> reserveList = new HashSet<>();
        HashSet<Integer> lostList = new HashSet<>();
        // reserve list 생성
        for(int i=0; i< reserve.length; i++){
            reserveList.add(reserve[i]);
        }
        // 혹시 reserve 중 lost 목록이 있으면 제거
        for(int i=0; i<lost.length; i++){
            if(reserveList.contains(lost[i]))
                reserveList.remove(lost[i]);
            else
                lostList.add(lost[i]);
        }
        // reserve 기준으로 좌우 확인하여 lost 목록 제거
        for(int i : reserveList){
            if (lostList.contains(i-1))
                lostList.remove(i-1);
            else if(lostList.contains(i+1))
                lostList.remove(i+1);
        }
        
        return n - lostList.size();
    }
}
