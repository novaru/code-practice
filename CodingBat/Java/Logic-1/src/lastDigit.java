public boolean lastDigit(int a, int b, int c) {
  return (a%5 == b%5 || b%5 == c%5 || a%5 == c%5);
}
