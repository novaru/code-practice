public String nTwice(String str, int n) {
  if (str.length()==n){
    return str + str;
  }  
  String first = str.substring(0, n);
  String last = str.substring(str.length()-n, str.length());
  return first + last;
}
