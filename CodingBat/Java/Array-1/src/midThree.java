public int[] midThree(int[] nums) {
  int[] mid = new int[3];
  mid[0] = nums[nums.length/2-1];
  mid[1] = nums[nums.length/2];
  mid[2] = nums[nums.length/2+1];
  return mid;
}
