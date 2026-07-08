class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
       Arrays.sort(nums);
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){ 
                for(int k=j+1;k<n;k++){
                   List<Integer> list1 = new ArrayList<>(); 
                    if(nums[i]+nums[j]+nums[k] == 0 && i!=j && j!=k && k!=i){
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        result.add(list1);
                    }
                }  
            }    
        }
        return new ArrayList<>(result);
    }
}
