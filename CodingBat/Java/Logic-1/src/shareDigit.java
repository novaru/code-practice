public boolean shareDigit(int a, int b) {
  double x = Math.floor(a/10);
  double y = Math.floor(b/10);
  return (x == y || x == b%10 || y == a%10 || a%10 == b%10);
}
