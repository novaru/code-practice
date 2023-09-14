public String front3(String str) {
  StringBuilder sb = new StringBuilder();
  if (str.length()>3){
    str = str.substring(0,3);
    for (int i=0; i<3;i++){
      sb.append(str);
    }
    str = sb.toString();
    return str;
  } else if (str.length()>0){
    for (int i=0; i<3;i++){
      sb.append(str);
    }
    str = sb.toString();
    return str;
  }
  return str;
}
