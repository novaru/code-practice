public int maxTriple(int[] nums) {
  int first = nums[0];
  int mid = nums[nums.length/2];
  int last = nums[nums.length-1];
  int max = Math.max(first, mid);
  max = Math.max(max, last);
  return max;
}
