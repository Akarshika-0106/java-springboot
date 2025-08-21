package codingpractice.DSAProblems.Problem2;

public class SmallestSubarrayWithMaxMin {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 9, 7, 1, 9, 4};
        System.out.println(smallestSubarray(arr1));
        int[] arr2 = new int[]{2, 2, 2, 2};
        System.out.println(smallestSubarray(arr2));
    }

    private static int smallestSubarray(int[] arr){
        int maxVal = arr[0];
        int minVal = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }

        int pos_min = -1;
        int pos_max = -1;
        int diff = 0;
        int len = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] == minVal){
                pos_min = i;
            }

            if(arr[i] == maxVal){
                pos_max = i;
            }

            if(pos_max != -1 && pos_min != -1){
                diff = Math.abs(pos_max - pos_min) + 1;
                len = Math.min(len, diff);
            }
        }
        return len;
    }
}
