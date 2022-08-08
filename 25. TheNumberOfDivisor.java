
public class t25_TheNumberOfDivisor {

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) { // L->R
			int cnt = 0;

			for (int j = 1; j <= i; j++) { // 약수구하기
				if (i % j == 0)
					cnt++; // 약수의 개수
			}

			if (cnt % 2 == 0) // 짝수면 +, 홀수면 -
				answer += i;
			else
				answer -= i;
		}

		return answer;
	}
	
	
	

	public int solution2(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			// 제곱수인 경우 약수의 개수가 홀수
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			}
			// 제곱수가 아닌 경우 약수의 개수가 짝수
			else {
				answer += i;
			}
		}

		return answer;
	}

}
