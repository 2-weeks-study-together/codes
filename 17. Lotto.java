package lec07;

public class Lotto {
    public static void main(String[] args) {
        Test17 t = new Test17();

        int[] lottos ={44,1,0,0,31,25};
        int[] lottos2 ={0,0,0,0,0,0};
        int[] lottos3 ={45,4,35,20,3,9};
        int[] win_nums ={31,10,45,1,6,19};
        int[] win_nums2 ={38,19,20,40,15,25};
        int[] win_nums3 ={20,9,3,45,4,35};

        int[] r= t.solution(lottos, win_nums);

        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }

    }
}

class Test17{
    int[] solution(int[] lottos, int[] win_nums){
        int[] result = new int[2];

        int match_cnt=0;
        int zero_cnt=0;

        for(int i=0; i<lottos.length;i++){
            if(lottos[i]==0)
                zero_cnt++;

            for(int j=0; j<win_nums.length;j++){
                if(win_nums[j]==lottos[i])
                    match_cnt++;

            }
        }

        result[0] = Math.min(7-(match_cnt +zero_cnt),6);
        result[1] = Math.min(7-match_cnt,6);
        return result;
    }
}
