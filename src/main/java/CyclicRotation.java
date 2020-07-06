import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = new int[]{};
        int K=3;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(new Solution().solution(A, K)));
    }

    static class Solution {
        int length;
        public int[] solution(int[] A, int K){
            length = A.length;
            if (length==0){
                return new int[]{};
            }
            for (int i = 1; i <= K; i++) {
                A = shiftArray(A);
            }
            return A;
        };

        public int[] shiftArray(int[] A) {
            int[] res = new int[length];
            System.arraycopy(A, 0, res, 1, length-1);
            res[0] = A[length-1];
            return res;
        }
    }
}

