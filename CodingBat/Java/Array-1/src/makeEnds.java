public int[] makeEnds(int[] nums) {
  int[] edge = new int[2];
  edge[0] = nums[0];
  edge[1] = nums[nums.length-1];
  return edge;
}
