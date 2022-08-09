import java.util.Arrays;

public class Dartgames {
	 public static int solution(String dartResult) {
	        int answer = 0;
	        int num=0, idx = 0; //보너스까지 적용한 점수, 다트 점수의 인덱스
	        int[] dart_score = new int[3]; //각 회차의 다트 점수 담을 배열
	        String number = ""; //숫자일 경우, 10의 자리도 가능하니 이어 붙이기
	        
	        for(int i=0; i<dartResult.length();i++) {
	        	char c = dartResult.charAt(i);
	        	
	        	if(c>='0'&&c<='9') {
	        		number += String.valueOf(c);
	        	} //숫자일 때 문자를 숫자로 받아옴
	        	
	        	else if(c=='S'||c=='D'||c=='T') {
	        		num = Integer.parseInt(number);	        		
	        		if(c=='S') {
	        			dart_score[idx++] = (int)Math.pow(num, 1);
	        		}
	        		else if(c=='D') {
		        		dart_score[idx++] = (int)Math.pow(num, 2);
	
	        		}
	        		else {
		        		dart_score[idx++] = (int)Math.pow(num, 3);
	        		}
	        		number = ""; //받아온 문자열 형식의 숫자 초기화
	        	} //보너스 일때 1, 2, 3 거듭제곱	        	
	        	else if(c=='*'||c=='#') {
	        		if(c=='*') {
	        			dart_score[idx-1]*= 2; 
	        			if(idx-1>0) dart_score[idx-2]*=2;
	        			} //첫 번째 기회 *은 첫 번째 점수만 두 배, 아니면 현재와 전 점수 2배
	        		else {
	        			dart_score[idx-1]*=(-1);
	        		} //해당 점수 -
	        	}
	        		
	        }
	 
	        answer = Arrays.stream(dart_score).sum();//배열의 합계 구하기    
	        	        
	        return answer;	    	        	        
	    }
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		
		System.out.println(solution(dartResult));

	}

}
