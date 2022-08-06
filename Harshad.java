//https://school.programmers.co.kr/learn/courses/30/lessons/12947

package lec07;

public class Harshad {
    public static void main(String[] args) {
        Test12 t = new Test12();

        System.out.println(t.solution(10));
    }
}

class Test12 {
    boolean solution(int x){
        String[] arr = String.valueOf(x).split("");
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }

        if(x%sum ==0)
            return true;

        return false;
    }
}