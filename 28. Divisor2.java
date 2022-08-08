// https://school.programmers.co.kr/learn/courses/30/lessons/12928

package lec07;

public class Divisor {
    public static void main(String[] args) {
        Test28 t = new Test28();
        int[] r= t.solution(3,12);

        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }

    }
}

class Test28 {
    int[] solution(int n, int m) {
        int[] answer= new int[2];
        int min =n;

        if(n>m){
            min = m;
        }

        for(int i=min; i>=1;i--){
            if(n%i==0 && m%i==0) {
                answer[0] = i;
                break;
            }
        }

        answer[1]= (n*m)/answer[0];
        return answer;
    }
}
