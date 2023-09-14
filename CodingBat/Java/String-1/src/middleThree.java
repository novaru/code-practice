public String middleThree(String str) {
  if (str.length()>3){
    int start = (str.length()+1)/2-2;
    int end = (str.length()+1)/2+1;
    String mid = str.substring(start, end);
    return mid;
  }
  return str;
}
