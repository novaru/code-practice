public String lastTwo(String str) {
  if (str.length()>=2){
    char last = str.charAt(str.length()-2);
    String word = str.substring(0, str.length()-2) + str.substring(str.length()-1, str.length());
    return word + Character.toString(last);
  }
  return str;
}
