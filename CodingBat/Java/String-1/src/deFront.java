public String deFront(String str) {
  if (str.length()>=2){
    String end = str.substring(2);
    if(str.charAt(0)=='a'){
      if(str.charAt(1)=='b'){
        return "ab" + end;
      }
      return "a" + end;
    }if(str.charAt(1)=='b'){
        return "b" + end;
    }
    return end;
  }
  return str;
}
