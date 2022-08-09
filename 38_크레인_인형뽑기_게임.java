import java.util.Stack;

public class init38 {
    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
//            https://jud00.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%8A%A4%ED%83%9DStack%EA%B3%BC-%ED%81%90Queue%EC%97%90-%EB%8C%80%ED%95%B4%EC%84%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90
            Stack<Integer> stack = new Stack<>();
            for (int move : moves) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][move - 1] != 0) {
                        if (stack.isEmpty()) {
                            stack.push(board[j][move - 1]);
                            board[j][move - 1] = 0;
                            break;
                        }
                        if (board[j][move - 1] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else
                            stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
