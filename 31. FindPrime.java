
public class t31_FindPrime {

	public int solution(int n) {
		int count = 0;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) result++; //1과 자기 자신으로만 나누어 떨어지는 경우
			count = 0; //다시 초기화
		}

		return result;
	}

	public static void main(String[] args) {
		t31_FindPrime prime = new t31_FindPrime();
		System.out.println(prime.solution(10));
	}

}
