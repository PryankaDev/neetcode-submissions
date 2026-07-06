class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nums1 = new HashSet<>();
        for(int n : nums){
            nums1.add(n);
        }
        if(nums1.size() != nums.length){
            return true;
        }
        return false;
    }
}