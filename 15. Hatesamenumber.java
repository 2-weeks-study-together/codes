package codingtest;
import java.util.*;

public class Hatesamenumber {
	
	 public static int[] solution(int []arr) {
	        int same = arr[0];
	        ArrayList<Integer>hate = new ArrayList<Integer>();
	        
	        hate.add(arr[0]); //same을 arr[0]으로 지정해 hate idx 0번에 넣어줘야함
	        
	        for(int i=0;i<arr.length;i++) {   
	    	   if(same!=arr[i]) { 
	    		   hate.add(arr[i]);
	    		   same = arr[i];	    		   
	    	   } //리스트 순서대로 같지 않은 수만 집어 넣음
	       }
	       
	        int[]answer = new int[hate.size()]; 
	        
	        for(int i =0;i<hate.size();i++) {
	    	   answer[i] = hate.get(i);
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		
		int arr[] = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));

		
	}
}
