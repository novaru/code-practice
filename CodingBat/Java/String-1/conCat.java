public String conCat(String a, String b) {
  if (a.length()!=0 && b.length()!=0){
    char aLast = a.charAt(a.length()-1);
    char bFirst = b.charAt(0);
    if (aLast == bFirst){
      return a.substring(0, a.length()-1) + b;
    }    
  }
  return a + b;
}
