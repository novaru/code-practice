public int greenTicket(int a, int b, int c) {
  if (a == b || b == c || a == c)
  {
    if (a == b && b == c) return 20;
    return 10;
  }
  return 0;
}
