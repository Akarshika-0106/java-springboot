package codingpractice.DSAProblems;

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


//Aggressive Cows
//
//Given an array stalls[] representing the positions of stalls and an integer k denoting the number of aggressive cows,
//place the cows in the stalls such that the minimum distance between any two cows is as large as possible.
//Return this maximum possible minimum distance.
//
//Examples:
//
//Input: stalls[] = [1, 2, 4, 8, 9], k = 3
//Output: 3
//Explanation: We can place cow 1 at position 1, cow 2 at position 4 and cow 3 at position 9.
//So, the maximum possible minimum distance between two cows is 3.
//
//Input: stalls[] = [6, 7,  9, 11, 13, 15], k = 4
//Output: 2
//Explanation: We can place cow 1 at position 6, cow 2 at position 9, cow 3 at position 11 and cow 4 at position 15.
//So, the maximum possible minimum distance between two cows is 2.
