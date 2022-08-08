package codingtest;
import java.util.*;
public class New_ID {
	public static String solution(String new_id) {
		String answer="";
        
        String step1 = new_id.toLowerCase();
        //1. 소문자 변환
        
        char[] arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }
        //2. 소문자, 0-9, ., -, _ 제외 문자 제거
       
       
        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        //3. ..일 경우 replace로 대체, 한번더 포함됬는지 확인 후 있으면 제거

        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }
        //4. 마지막이나 첫 번째 글자에 .이 포함되면 제거

        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }
        //5. 비어있으면 a로 대체

        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }
        //6. 글자가 15자 이상 안넘어 가며 마지막에 .없게 제거
       
        StringBuilder step7 = new StringBuilder(step6);
        if (step7.length() <= 2) {
            char add = step7.charAt(step7.length() - 1);

            while (step7.length() < 3) {
                step7.append(add);
            }
        }
        //7. 2글자 이하면 3글자가 되도록 마지막 문자를 붙여줌
        
        answer = String.valueOf(step7);
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String new_id = sc.nextLine();
		System.out.println("입력하신 아이디 "+new_id+"는 아이디 "+solution(new_id)+"로 사용가능합니다.");
		sc.close();
		System.exit(0);
	}
}

/*정규 표현식 이용
String answer = new_id.toLowerCase(); //1

answer = answer.replaceAll("[^-_.a-z0-9]", ""); //2
answer = answer.replaceAll("[.]{2,}", "."); //3
answer = answer.replaceAll("^[.]|[.]$", ""); //4

if (answer.equals("")) {   
           answer += "a";
       } //5

if (answer.length() >= 16) {     
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        } //6

if (answer.length() <= 2) {  
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        } // 7

return answer; */
