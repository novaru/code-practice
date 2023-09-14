public boolean unlucky1(int[] nums) {
  boolean unlucky = false;
  for (int i=0; i<nums.length-1; i++)
  {
    if ((nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3) || (nums[nums.length-2]==1 && nums[nums.length-1]==3))
    {
      unlucky = true;
    }
  }
  return unlucky;
}
