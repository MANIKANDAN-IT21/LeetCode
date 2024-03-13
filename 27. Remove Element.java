class Solution {
    public int removeElement(int[] nums, int val) {
        int i;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}