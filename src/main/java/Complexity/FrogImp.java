package Complexity;

public class FrogImp {
    public static void main(String[] args) {
        int X=1;
        int Y=6;
        int D=2;
        System.out.println(new Solution().solution(X,Y,D));
    }

    static class Solution {
        public int solution(int X, int Y, double D) {
            if (X<1 || Y<1 || D<1 || Y<X){
                return 0;
            }
            return (int) Math.ceil((Y-X)/D);
        }
    }
}
