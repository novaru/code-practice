public int sumLimit(int a, int b) {
  String sum = String.valueOf(a+b);
  String num = String.valueOf(a);
  if (sum.length() > num.length()) return a;
  return a+b;
}
