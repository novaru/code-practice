public int[] frontPiece(int[] nums) {
  int[] two = new int[2];
  if (nums.length > 2)
  {
    two[0] = nums[0];
    two[1] = nums[1];
    return two;
  }
  return nums;
}
