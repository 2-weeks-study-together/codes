//	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
//	nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

public class t21_MakePrimeNumber {

	public int solution(int[] nums) {
		int answer = 0;
		boolean chk = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k]; // 값을 담아
					if (num >= 2) // 경우의 수를 찾아서
						chk = prime(num);
					if (chk == true) // 소수가 맞을 경우
						answer++;

				}
			}

		}
		return answer;
	}

	public boolean prime(int num) {
		boolean check = true;
		if (num == 2) { // 소수일때
			return check;

		}
		for (int i = 2; i < num; i++) { // 소수가 아닐때
			if (num % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}

}
