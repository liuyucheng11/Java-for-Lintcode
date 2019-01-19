public class SonList {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        int [] book = new int[nums.length];
        // write your code here
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,nums,book,result);
        for (int i = 0; i <result.size() ; i++) {
            Collections.sort(result.get(i));

        }
        return  result;
    }
    public void  dfs(int i,int nums[],int book[],List<List<Integer>> result){
        if(i>=nums.length){
            List<Integer> temp = new ArrayList<>();

            //遍历book查找存入list
            for (int j = 0; j < book.length ; j++) {
                if(book[j] ==1 ){
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
            return;

        }
        //标记取出,下一次取
        book[i] =1;
        dfs(i+1,nums,book,result);
        //不取
        book[i] = 0;
        dfs(i+1,nums,book,result);
    }
}