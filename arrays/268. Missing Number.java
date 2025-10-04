class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length +1 ]; 
    for (int i = 0; i <= nums.length - 1; i++)
        arr[nums[i]]++;
    for (int i = 0; i <= arr.length; i++) {      // better ---- tc : O(2n)   Sc : O(n)
        if (arr[i] == 0) {
            return i;
        }
    }
    return -1;
    }
}


// class Solution {
//     public int missingNumber(int[] nums) {
//         int x=0,y=0 ;
//         for(int i=0;i< nums.length ;i++) {
//             x ^= nums[i] ;                     // tc: O(n)
//             y ^= i ;
//         }

//         return x ^ y ^ nums.length;
//     }
// }
