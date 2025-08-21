package codingpractice.DSAProblems.Problem1;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls1 = new int[]{1, 2, 4, 8, 9};
        System.out.println(aggressiveCows(stalls1, 3));
        int[] stalls2 = new int[]{6, 7,  9, 11, 13, 15};
        System.out.println(aggressiveCows(stalls2, 4));
    }

    private static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1;
        int right = stalls[n-1] - stalls[0];
        int ans=0;
        while(left <= right){
            int mid = (left + right)/2;
            if(canPlaceCow(stalls, mid, k)){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    private static boolean canPlaceCow(int[] stalls, int dis, int k){
        int cowCount = 1;
        int last = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - last >= dis){
                cowCount++;
                last = stalls[i];
            }
            if(cowCount >= k){
                return true;
            }
        }
        return false;
    }
}
