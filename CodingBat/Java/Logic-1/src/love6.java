public boolean love6(int a, int b) {
  int num = Math.abs(a - b);
  int sum = a + b;
  return (a == 6 || b == 6 || sum == 6 || num == 6);
}
