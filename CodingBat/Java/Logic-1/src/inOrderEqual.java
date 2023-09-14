public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (equalOk) return ((a == b && b <= c) || (b == c && a <= b));
  return (a < b && b < c);
}
