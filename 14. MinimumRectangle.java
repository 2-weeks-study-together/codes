
public class t14_MinimumRectangle {
	
	public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
	
	
	public int solution2(int[][] sizes) {
        int answer = 0;
        int max_v=0;
        int max_h=0;
        for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            max_v=Math.max(max_v,v);
            max_h=Math.max(max_h,h);
        }
        answer=max_v*max_h;
        return answer;
    }
	
	//2차원 배열 axis1의 i번 째의 [0], [1]중 min, max 메소드를 사용하여 max를 가로, min을 세로로 저장한다.(sizes의 length만큼 반복)
	//v가 가로, h가 세로가 된다. -> max메소드로 가장 긴 가로와 세로를 다시 정한다.
	//포문이 끝나고 max_v, max_h 곱한 것이 최소 직사각형

}
