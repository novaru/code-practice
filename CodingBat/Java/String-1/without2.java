public String without2(String str) {
  if (str.length()>=2){
    String first = str.substring(0, 2);
    String end = str.substring(str.length()-2, str.length());
    if (first.equals(end)){
      return str.substring(2, str.length());
    }    
  }
  return str;
}
