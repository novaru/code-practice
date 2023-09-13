public String comboString(String a, String b) {
  if (a.length() < b.length()){
    String tmp = a;
    a = b;
    b = tmp;
  }
  return b + a + b;
}
