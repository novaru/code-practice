public String startWord(String str, String word) {
  if (str.length() >= word.length())
  {
    if (str.substring(1, word.length()).equals(word.substring(1)))
    {
      return str.substring(0, word.length());
    }
  }
  return "";
}
