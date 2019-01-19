public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        
        int minSum = 0 ;
        for(Integer a : nums)
        minSum +=a ;
     int CurSum = 0;
     for(int i=0;i<nums.size();i++){
         CurSum +=nums.get(i);
         if(CurSum<minSum)
         minSum = CurSum;
         if(CurSum >0)
         CurSum =0 ;
     }
     return minSum;
    }
    
}