import java.util.*;


public class Failure_rate {
	 public static int[] solution(int N, int[] stages) {
	       HashMap<Integer, Double> failure = new HashMap<>();
		 
		   int[] answer = {};	        
	        
	       int[] user_stay = new int[N+2];//각 스테이지에 머물러 있는 사용자 수
	       int[] user_total = new int[N+1]; //각 스테이지에 도달한 전체 사용자 수 
	        
	        for(int i=0; i<stages.length;i++) {
	        	user_stay[stages[i]]++;
	        } //stages의 값에 해당되는 배열의 카운트를 늘려 각 스테이지에 몇명 들어갔는지 확인
	        
	        user_total[N] = user_stay[N]+user_stay[N+1]; //맨 마지막 스테이지 도달한 사용자 수
	        
	        for(int i=N-1;i>=1;i--) {
	        	user_total[i] = user_stay[i]+user_total[i+1];
	        } //다음 스테이지를 통과한 것은 직전 스테이지를 통과한 것과 같으니 
	         //n 스테이지 머문 인원+ (n+1) 스테이지 통과 인원 = n 스테이지에 도달한 전체 사용자 수 
	        
	        for(int i=1;i<user_total.length;i++) {
	        	if(user_stay[i]==0||user_total[i]==0) {
	        		failure.put(i, 0.0); //둘 중에 하나라도 0이면 나눴을 때 0.0%라 설정
	        	}else {
	        		failure.put(i,(double)user_stay[i]/user_total[i]);
	        	}//도달했지만 클리어x 플레이어 수/도달한 플레이어 수 = 실패율 
	        }//실패율 구하기
	        
	        List<Integer> rate = new ArrayList<>(failure.keySet());
	        Collections.sort(rate,(o1,o2)->Double.compare(failure.get(o2), failure.get(o1)));
	        //double의 값을 비교하니 즉 실패율 값으로 스테이지 번호(key) 내림차순 정렬
	       
	        answer = rate.stream().mapToInt(Integer::intValue).toArray();
	        //stream을 람다식으로 통해 배열로 내림차순한 스테이지 번호 가져오기
	        //rate안에서 int 형식의 value를(스테이지 번호) int 타입으로 가져와 그 리스트를 array 형식으로 변경
	        return answer;
	    }
	public static void main(String[] args) {
			int N = 5;
			int[] stages = {2,1,2,6,2,4,3,3};
			
			System.out.println(Arrays.toString(solution(N, stages)));
		
		
	}

}
