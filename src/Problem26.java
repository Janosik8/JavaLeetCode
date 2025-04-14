public class Problem26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }

        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
