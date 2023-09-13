public String frontBack(String str) {
  if (str.length()>=2){
    String center = str.substring(1, str.length()-1);
    return str.charAt(str.length()-1) + center + str.charAt(0);}
  return str;
}
