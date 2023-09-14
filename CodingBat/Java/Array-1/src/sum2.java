public int sum2(int[] nums) {
  int n = nums.length, sum = 0;
  if (n > 1) sum = nums[0] + nums[1];
  if (n == 1) sum = nums[0];
  return sum;
}
