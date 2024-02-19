class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] nums) {
        int x = 0;
        int len = nums.length - 1;
        for (int i = 0; i <= len;) {
            if (nums[i] == 0) {
                swap(nums, i++, x++);
            } else if (nums[i] == 1) {
                ++i;
            } else {
                swap(nums, i, len--);
            }
        }
    }
}
