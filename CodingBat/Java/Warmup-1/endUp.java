public String endUp(String str) {
  if (str.length()>=3){  
    String front = str.substring(0,str.length()-3);
    String end = str.substring(str.length()-3, str.length()).toUpperCase();
    return front+end;
  } 
  return str.toUpperCase();
}
