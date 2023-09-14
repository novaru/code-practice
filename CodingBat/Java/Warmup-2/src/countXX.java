int countXX(String str) {
  int n = 0;
  for (int i = 0; i < str.length() - 1; i++)
  {
    if (str.substring(i, i + 2).equals("xx")) n++;
  }
  return n;
}
