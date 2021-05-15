class MajorityElement {
    public int majorityElement(int[] nums) {
        int ans = nums[0], count =1;
        for(int i=1;i<nums.length;i++){
            if(ans==nums[i])
                count++;
            else if(count==0)
                ans=nums[i];
            else
                count--;
        }
        return ans;
    }
}