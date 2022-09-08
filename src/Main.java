public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,7,9};
        int target = 4;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        if(nums[0]>=target){
            return 0;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target || nums[i]>target){
                return i;
            }
        }

        return nums.length;

    }
}