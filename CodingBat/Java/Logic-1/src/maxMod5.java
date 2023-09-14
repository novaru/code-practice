public int maxMod5(int a, int b) {
  if (a < b)
  {
    int tmp = a;
    a = b;
    b = tmp;
  }
  if (a == b) return 0;
  if (a%5 == b%5) return b;
  return a;
}
