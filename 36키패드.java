class Solution {
    
    Position right;
    Position left;
    Position numPos;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";    
        //1 왼손 오른손 초기화
        left = new Position(3,0);
        right = new Position(3,2);
        
        for(int n : numbers){
            //2 숫자를 누를  손가락 정하기
            numPos = new Position((n-1)/3, (n-1)%3 );
            if(n==0)
                numPos = new Position(3,1);
            String finger = numPos.getFinger(hand);
            
            //3 정해진 손가락을 answer에 담고 손가락 위치 업데이트
            answer += finger;
            if(finger.equals("L"))
                left = numPos;
            else
                right = numPos;
        }
        return answer;
    }
    
    class Position{
        int row; 
        int col;
        
        Position(int row, int col){
            this.row = row;
            this.col = col;
        }
        //누르는 손가락 정하기
        public String getFinger(String hand){
            String finger = hand.equals("right") ? "R" : "L";
            if(this.col ==0)
                finger = "L";
            else if(this.col == 2)
                finger = "R";
            else{
                int leftDist = left.getDistance(this);
                int rightDist = right.getDistance(this);
                
                if(leftDist < rightDist)
                    finger = "L";
                else if (leftDist > rightDist)
                    finger = "R";
            }
            return finger;
        }
        // 버튼과 손 간에 거리 구하기
        public int getDistance(Position p){
            return Math.abs(this.row - p.row) + Math.abs(this.col - p.col);
        }
        
        
    }
    
    
}


// 참고영상 : https://www.youtube.com/watch?v=jFv2LRVCK6s
