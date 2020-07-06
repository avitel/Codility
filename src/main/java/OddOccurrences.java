import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        int[] A = new int[]{9,3,9,3,9,7,9};
        System.out.println(Arrays.toString(A));
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            Set<Integer> pairs = new HashSet<>(A.length);
            for (int value: A) {
                if (pairs.contains(value)){
                    pairs.remove(value);
                }else {
                    pairs.add(value);
                }
            }
            if (pairs.size()==1){
                return pairs.iterator().next();
            }else if (pairs.size()>1){
                System.out.println("there are " + pairs.size() + " unpaired items in the array");
            }else {
                System.out.println("there are no unpaired items in the array");
            }
            return 0;
        }
    }
}
