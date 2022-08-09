//https://school.programmers.co.kr/learn/courses/30/lessons/1845

package lec07;
import java.util.Arrays;
import java.util.HashSet;

public class Pokemon {
    public static void main(String[] args) {
        Test34 t = new Test34();

        int[] nums= {3,1,2,3};
        int[] nums2= {3,3,3,2,2,4};
        int[] nums3= {3,3,3,2,2,2};

        System.out.print(t.solution(nums));
    }
}

class Test34{
    int solution(int[] nums){
        int answer = 1;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && answer<nums.length/2){
                answer++;
            }
        }
        return answer;

//        int answer;
//        HashSet<Integer> mon = new HashSet();
//
//        for(int i=0; i<nums.length;i++){
//            mon.add(nums[i]);
//        }
//
//        answer = (mon.size()>nums.length/2) ? nums.length/2 : mon.size();
//        return answer;
    }
}
