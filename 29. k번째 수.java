package codingtest;

import java.util.*;

public class Number_of_k {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
       for(int i=0; i<commands.length;i++) {
    	   ArrayList<Integer> cut = new ArrayList<Integer>();
    	   for(int j= commands[i][0]-1;j<commands[i][1];j++) {//배열은 0부터 시작하니 -1
    		   cut.add(array[j]);
    	   } //i부터 j까지 수 리스트에 담기
    	   Collections.sort(cut);
    	   answer[i] = cut.get(commands[i][2]-1); //k번째 수 선택해 배열 담기
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
	}

}

/* copyOFRange를 이용한 방법
int[] answer = new int[commands.length];

for(int i=0; i<commands.length; i++){
    int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
    Arrays.sort(temp);
    answer[i] = temp[commands[i][2]-1];
}

return answer;*/
