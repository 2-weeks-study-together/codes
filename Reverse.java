package lec07;

public class Reverse {
    public static void main(String[] args) {

        Test07 t = new Test07();

        int [] a= t.solution(56789);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
