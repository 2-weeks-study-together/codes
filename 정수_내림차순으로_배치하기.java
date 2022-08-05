// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.Arrays;

public class init8 {
    public static void main(String[] args) {
        final long N= 118372;
        Solution8 s6= new Solution8();
        long result= s6.solution(N);

        if (result == 873211){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Solution8{
    public long solution(long N){
        long answer;
        String[] list= String.valueOf(N).split("");
        Arrays.sort(list);

        StringBuffer sb= new StringBuffer();
        for(String element: list) sb.append(element);

        String result= (sb.reverse().toString());
        answer= Long.parseLong(result);
        return answer;
    }
}
