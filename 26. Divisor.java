// https://school.programmers.co.kr/learn/courses/30/lessons/12928

package lec07;

public class Divisor {
    public static void main(String[] args) {
        Test26 t = new Test26();

        System.out.println(t.solution(5));

    }
}

class Test26 {
    int solution(int n) {
        int answer=0;

        for(int i=1; i<=n;i++){
            if(n%i==0)
                answer +=i;
        }
        return answer;
    }
}
