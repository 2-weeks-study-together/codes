
import java.util.*;


public class t19_SortString {
	
	 public String[] solution(String[] strings, int n) {
	        String[] answer = {};
	        ArrayList<String> arr = new ArrayList<>();
	        for (int i = 0; i < strings.length; i++) {
	            arr.add("" + strings[i].charAt(n) + strings[i]);
	        }
	        Collections.sort(arr);
	        answer = new String[arr.size()];
	        for (int i = 0; i < arr.size(); i++) {
	            answer[i] = arr.get(i).substring(1, arr.get(i).length());
	        }
	        return answer;
	    }
	 
	//Collections.sort(arraylist): ArrayList 정렬   <------->   Arrays.sort(array): 배열 정렬
	 //ArrayList는 변수명.add로 추가해준다.(반복문)
	 //substring(시작인덱스, 끝인덱스) 추출하기
	 //charAt(n) : 인덱스 n번 째에 있는 character 가져오기

}
