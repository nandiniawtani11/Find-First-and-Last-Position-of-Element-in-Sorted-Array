class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr=new int[2];
        int i=0;
        int count=0;
        boolean flag=true;
        while(i<nums.length)
        {
            if(flag)
            {
                if(nums[i]==target)
                {
                    arr[0]=i;
                    flag=false;
                }
            }
            else if(!flag && nums[i]==target)
            {
                count=count+1;
            }
            i++;
        }
        arr[1]=arr[0]+count;
        if(flag)
        {
            arr[0]=-1;
            arr[1]=-1;
        } 
        return arr;
    }
}
