public boolean frontAgain(String str) {
  if (str.length()>=2){
    String end = str.substring(str.length()-2,str.length());
    return str.substring(0,2).equals(end);
  }
  return false;
}
