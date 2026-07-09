class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        if(target < nums[mid]){
            for(int i =0;i<mid;i++){
                if(target == nums[i]){
                    return i;
                }
            }
        }else{
            for(int i =mid;i<nums.length;i++){
                if(target == nums[i]){
                    return i;
                }
            }

        }
        return -1;
    }
}
