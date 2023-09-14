public boolean hasBad(String str) {
  if (str.length()>3){
    return str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad");
  }else if(str.length()>2){
    return str.substring(0, 3).equals("bad");
  }
  return false;
}
