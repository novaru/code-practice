public String minCat(String a, String b) {
  int x = a.length();
  int y = b.length();
  if(x > y){
    return a.substring(x-y, x) + b;
  }if(x < y){
    return a + b.substring(y-x, y);
  }
  return a + b;
}
