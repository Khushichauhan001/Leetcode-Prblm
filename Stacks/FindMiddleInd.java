class Solution {
    public int findMiddleIndex(int[] nums) {

        int totalSum = 0, leftSum = 0;
        
      
        for (int num : nums) {
            totalSum += num;
        }

       
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; 
            }
            leftSum += nums[i]; 
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        
        int[] nums1 = {2, 3, -1, 8, 4};
        System.out.println(s1.findMiddleIndex(nums1)); 
        int[] nums2 = {1, -1, 4};
        System.out.println(s1.findMiddleIndex(nums2)); 

        int[] nums3 = {2, 5};
        System.out.println(s1.findMiddleIndex(nums3)); 
    }
}
 