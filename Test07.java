package lec07;

public class Test07 {
    public int [] solution(long num){
        String[] arr = Long.toString(num).split("");
        int[] result = new int[arr.length];
        int cnt=0;

        while(num>0){
            result[cnt]=(int)(num%10);
            num/=10;
            cnt++;
        }
        return result;
    }
}
