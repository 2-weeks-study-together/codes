// https://school.programmers.co.kr/learn/courses/30/lessons/12917
// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class init20 {
    public static void main(String[] args) {
        String str= "Zbcdefg";
        
        System.out.println(Sol20.solA(str));
        System.out.println(Sol20.reverseStr(str));
    }
}

class Sol20 {
    protected static String solA(String str) {
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        StringBuffer sb= new StringBuffer(new String(arr));
        return sb.reverse().toString();
    }

    public static  String reverseStr(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}
