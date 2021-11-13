class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int indexNums = 0;
        int indexAns = 0;
        for (; indexNums < nums.length / 2; indexNums++, indexAns += 2) {
            ans[indexAns] = nums[indexNums];
            ans[indexAns + 1] = nums[nums.length / 2 + indexNums];
        }

        return ans;
    }
}