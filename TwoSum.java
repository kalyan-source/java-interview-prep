class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2]; int count=0;
        for(int i=0;i<nums.length-1; i++){
            for(int j=1;j<nums.length;j++){ 
                int a = nums[i], b= nums[j];
                if(a+b==target && i!=j){
                arr[0]=i;
                arr[1]=j;
                }
            }
        }
        return arr;
    }
}