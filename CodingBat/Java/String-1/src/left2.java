public String left2(String str) {
  if (str.length()>2){
    String first = str.substring(0,2);
    String end = str.substring(2,str.length());
    return end + first;
  }
  return str;
}
