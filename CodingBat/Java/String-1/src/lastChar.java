public String lastChars(String a, String b) {
  if (a.length()==0 && b.length()==0){
    return "@@";
  }if (a.length()==0 && b.length()!=0){
    a = "@";
    return a + b.substring(b.length()-1);
  }if (a.length()!=0 && b.length()==0){
    b = "@"; 
    return a.substring(0,1) + b;
  }
  return a.substring(0,1) + b.substring(b.length()-1);
}
