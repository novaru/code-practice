public boolean endsLy(String str) {
  if (str.length()>1){
    String ly = str.substring(str.length()-2, str.length());
    return ly.equals("ly");
  }
  return false;
}
