package lec01;

public class Div {

    public static void main(String[] args){
        Test t = new Test();

            int[] array ={5,9,7,10};
            int[] array2 ={2,36,1,3};
            int[] array3 ={3,2,6};

            int[] r = t.solution(array3, 10);

            for(int i=0; i<r.length;i++){
                System.out.print(r[i]+" ");
            }
    }
}
