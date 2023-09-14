boolean doubleX(String str) {
  int n = str.indexOf("x");
  if (n >= 0) {
    String s = str.substring(n);
    return s.startsWith("xx");
  }
  return false;
}
