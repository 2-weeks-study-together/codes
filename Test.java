package lec01;
import java.util.*;

public class Test {
    int[] solution(int[] arr, int divisor) {
        int[] result={-1};
        int cnt =0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]% divisor ==0){
                cnt++;
            }
        }
        if(cnt>=1){
            result = new int[cnt];
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]% divisor ==0){
                result[cnt-1]=arr[i];
                cnt--;
            }
            if(cnt ==0){
                break;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
