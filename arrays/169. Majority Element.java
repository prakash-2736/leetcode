class Solution {
    public int majorityElement(int[] nums) {
        //     Arrays.sort(nums);
        //     int n= nums.length;
        //     int c=1;
        //     for(int i=0;i<n-1;i++){
        //         if(nums[i] == nums[i+1]){
        //             c++;
        //             if(c>n/2){
        //                 return nums[i];
        //             }
        //         }
        //         else{
        //             c= 1;
        //         }
        //     }
        //     return nums[0];
        int candidate =0, count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0)
                candidate = nums[i];
            if (nums[i] == candidate) //  Boyer-Moore Majority Vote Algorithm
                count++;
            else
                count--;
        }
        return candidate;
    }
}
