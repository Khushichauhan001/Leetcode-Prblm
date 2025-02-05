// leetcode 53
class Solution {
    public int maxSubArray(int[] arr) {
             int n = arr.length;
        int maxiEle = Integer.MIN_VALUE;
        int sum = 0 ;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
             
            // maxiEle = Math.max(maxiEle , sum);
            if (sum > maxiEle) {
                maxiEle = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
            return maxiEle ;
    }
}
