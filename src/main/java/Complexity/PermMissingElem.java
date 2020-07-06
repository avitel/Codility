package Complexity;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        //int[] A = new int[]{9, 3, 8, 2, 6, 7, 5, 1};
        int[] A =new int[]{};
        System.out.println(Arrays.toString(A));
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            for (int i = 0; i < A.length; i++) {
                if (A[i] != i + 1) {
                    return i + 1;
                }
            }
            return A.length + 1;
        }
    }
}
