public String right2(String str) {
  if (str.length()>2){
    String first = str.substring(0, str.length()-2);
    String end = str.substring(str.length()-2, str.length());
    return end + first;
  }
  return str;
}
