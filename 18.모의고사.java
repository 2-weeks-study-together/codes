package codingtest;
import java.util.*;
public class Mockexam {
	public static int[]solution(int[]answers){
		int[]answer = {};
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		int ones =0, twoes =0, threes=0; // 몇번 맞췄는지 카운트 할 값
 		
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==one[i%one.length]) ones++; //i번째를 길이로 나누면 나머지가 같은 위치의 답
			if(answers[i]==two[i%two.length]) twoes++;
			if(answers[i]==three[i%three.length]) threes++;
		}
		int max = Math.max(Math.max(ones, twoes), threes);
		
		ArrayList<Integer>win = new ArrayList<Integer>();
		if(max==ones) win.add(1);
		if(max==twoes) win.add(2);
		if(max==threes) win.add(3); //순서대로 들어가므로 따로 오름차수 정렬 필요 없음
		answer = new int[win.size()];
		
		for(int i=0; i<win.size();i++) {
			answer[i] = win.get(i);
		}
		
		return answer;		
	}
	
	public static void main(String[] args) {
		int[] answers = {2,2,2,3,1,5,3,1,5,4,4,2,1,1};
		System.out.println(Arrays.toString(solution(answers)));
	}
}
