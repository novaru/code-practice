public boolean has271(int[] nums) {
  for (int i = 0; i < nums.length-2; i++)
  {
    if (nums[i] + 5 == nums[i+1]) 
    {
      int diff = nums[i] - 1;
      if (Math.abs(diff - nums[i+2]) < 3) return true;
    }
  }
  return false;
}
