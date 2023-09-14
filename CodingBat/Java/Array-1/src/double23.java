public boolean double23(int[] nums) {
  if (nums.length < 2) return false;
  int a = nums[0];
  int b = nums[1];
  return (a == 2 && b == 2) || (a == 3 && b == 3);
}
