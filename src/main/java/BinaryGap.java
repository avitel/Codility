import org.apache.commons.lang3.StringUtils;

public class BinaryGap {
    public static void main(String[] args) {
        int n=1041;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    public int solution(int N){
        String bin = Integer.toBinaryString(N);
        String cutBin = bin.replaceAll("0*$", "");
        System.out.println(cutBin);
        int longestGap = 0;
        int currGap = 0;
        for (char ch: cutBin.toCharArray()) {
            if(ch == '1') {
                longestGap = Integer.max(longestGap, currGap);
                currGap = 0;
            }else {
                currGap ++;
            }
        }
        return longestGap;
    };
}
