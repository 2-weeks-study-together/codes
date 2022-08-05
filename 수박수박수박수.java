//https://school.programmers.co.kr/learn/courses/30/lessons/12922?language=java
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

public class init {
    public static void main(String[] args) {
        Solution s = new Solution();
        StringBuffer result = new StringBuffer();
        result = s.solution(3);

        System.out.println(result);
    }
}


class Solution {
    public StringBuffer solution(int n) {
        final String str = "";
        final String one = "수";
        final String two = "박";

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < n; i++) {
            int cdt = i % 2;
            if (cdt == 0) {
                sb.append(one);
            }
            if (cdt == 1) {
                sb.append(two);
            }
        }
        return sb;
    }
}
