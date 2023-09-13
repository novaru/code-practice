public String extraEnd(String str) {
  String end = str.substring(str.length()-2, str.length());
  return end + end + end;
}
