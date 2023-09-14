public String startOz(String str) {
  if(str.length()<2){
    return str; 
  }else if(str.substring(0,2).equals("oz")){
    return "oz";
  }else if(str.charAt(0)=='o'){
      return "o";
  }else if(str.substring(1,2).equals("z")){
    return "z";
  }
  return "";
}
