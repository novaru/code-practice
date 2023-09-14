public boolean startHi(String str) {
  if (str.length()>=2){
    String front = str.substring(0,2);
    return (front.equals("hi"));
  }
  return false;
}
