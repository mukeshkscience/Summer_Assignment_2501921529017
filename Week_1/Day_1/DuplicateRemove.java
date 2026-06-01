class DuplicateRemove{
    public int removeDuplicates(int[] nums) {
        int k = 1;  Position for next unique element

        for (int i = 1; i  nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}