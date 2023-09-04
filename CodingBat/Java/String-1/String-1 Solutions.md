#### Table of Contents
- [helloName](#helloName)
- [makeAbba](#makeAbba)
- [makeTags](#makeTags)
- [makeOutWord](#makeOutWord)
- [extraEnd](#extraEnd)
- [firstTwo](#firstTwo)
- [firstHalf](#firstHalf)
- [withoutEnd](#withoutEnd)
- [comboString](#comboString)
- [nonStart](#nonStart)
- [left2](#left2)
- [right2](#right2) 
- [theEnd](#theEnd)
- [withouEnd2](#withoutEnd)
- [middleTwo](#middleTwo)
- [endsLy](#endsLy)
- [nTwice](#nTwice)
- [twoChar](#twoChar)
- [middleThree](#middleThree)
- [hasBad](#hasBad)
- [atFirst](#atFirst)
- [lastChars](#lastChars)
- [conCat](#conCat)
- [lastTwo](#lastTwo)
- [seeColor](#seeColor)
- [frontAgain](#frontAgain)
- [minCat](#minCat)
- [extraFront](#extraFont)
- [without2](without2)
- [deFront](#deFront)
- [startWord](#startWord)
- [withoutX](#withoutX) 
- [withoutX2](#withoutX2)
---
#### helloName
- Description:
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
- Solution:
```java
public String helloName(String name) {
  return "Hello " + name + "!";
}
```
---
#### makeAbba
- Description:
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
- Solution:
```java
public String makeAbba(String a, String b) {
  return a + b + b + a;
}
```
---
#### makeTags
- Description:
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
- Solution:
```java
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}
```
---
#### makeOutWord
- Description:
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<\<word>\>". Note: use `str.substring(i, j)` to extract the String starting at index i and going up to but not including index j.
- Solution:
```java
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2);
}
```
---
#### extraEnd
- Description:
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
- Solution:
```java
public String extraEnd(String str) {
  String end = str.substring(str.length()-2, str.length());
  return end + end + end;
}
```
---
#### firstTwo
- Description:
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that `str.length()` returns the length of a string.
- Solution:
```java
public String firstTwo(String str) {
  if (str.length() < 2) return str;
  return str.substring(0, 2);
}
```
---
#### firstHalf
- Description:
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
- Solution:
```java
public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}
```
---
#### withoutEnd
- Description:
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
- Solution:
```java
public String withoutEnd(String str) {
  return str.substring(1, str.length() - 1);
}
```
---
#### comboString
- Description:
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
- Solution:
```java
public String comboString(String a, String b) {
  if (a.length() < b.length())
  {
    String tmp = a;
    a = b;
    b = tmp;
  }
  return b + a + b;
}
```
---
#### nonStart
- Description:
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
- Solution:
```java
public String nonStart(String a, String b) {
  a = a.substring(1, a.length());
  b = b.substring(1, b.length());
  return a + b;
}
```
---
#### left2
- Description:
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
- Solution:
```java
public String left2(String str) {
  if (str.length() > 2)
  {
    String first = str.substring(0, 2);
    String end = str.substring(2, str.length());
    return end + first;
  }
  return str;
}
```
---
#### right2
- Description:
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
- Solution:
```java
public String right2(String str) {
  if (str.length() > 2)
  {
    String first = str.substring(0, str.length()-2);
    String end = str.substring(str.length()-2, str.length());
    return end + first;
  }
  return str;
}
```
---
#### theEnd
- Description:
Given a string, return a string length 1 from its front, unless **front** is false, in which case return a string length 1 from its back. The string will be non-empty.
- Solution:
```java
public String theEnd(String str, boolean front) {
  if (front){
    return str.substring(0, 1);
  }
  return str.substring(str.length()-1, str.length());
}
```
---
#### withouEnd2
- Description:
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
- Solution:
```java
public String withouEnd2(String str) {
  if (str.length() > 2)
  {
    return str.substring(1, str.length()-1);
  }
  return "";
}
```
---
#### middleTwo
- Description:
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
- Solution:
```java
public String middleTwo(String str) {
  String mid = str.substring(str.length()/2-1, str.length()/2+1);
  return mid;
}
```
---
#### endsLy
- Description:
Given a string, return true if it ends in "ly".
- Solution:
```java
public boolean endsLy(String str) {
  if (str.length() > 1)
  {
    String ly = str.substring(str.length()-2, str.length());
    return ly.equals("ly");
  }
  return false;
}
```
---
#### nTwice
- Description:
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
- Solution:
```java
public String nTwice(String str, int n) {
  if (str.length() == n)
  {
    return str + str;
  }  
  String first = str.substring(0, n);
  String last = str.substring(str.length()-n, str.length());
  return first + last;
}

```
---
#### twoChar
- Description:
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
- Solution:
```java
public String twoChar(String str, int index) {
  if (index+2 > str.length() || index < 0)
  {
    return str.substring(0, 2);
  }
  return str.substring(index, index+2);
}
```
---
#### middleThree
- Description:
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
- Solution:
```java
public String middleThree(String str) {
  if (str.length() > 3)
  {
    int start = (str.length()+1) / 2 - 2;
    int end = (str.length()+1) / 2 + 1;
    String mid = str.substring(start, end);
    return mid;
  }
  return str;
}
```
---
#### hasBad
- Description:
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use `.equals()` to compare 2 strings.
- Solution:
```java
public boolean hasBad(String str) {
  if (str.length() > 3)
  {
    return str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad");
  }
  else if (str.length() > 2)
  {
    return str.substring(0, 3).equals("bad");
  }
  return false;
}
```
---
#### atFirst
- Description:
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
- Solution:
```java
public String atFirst(String str) {
  if (str.length() < 1) return "@" + "@";
  if (str.length() < 2) return str + "@";
  return str.substring(0, 2);
}

```
---
#### lastChars
- Description:
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
- Solution:
```java
public String lastChars(String a, String b) {
  if (a.length() == 0 && b.length() == 0) return "@@";
  if (a.length() == 0 && b.length() != 0)
  {
    a = "@";
    return a + b.substring(b.length()-1);
  }
  if (a.length() != 0 && b.length() == 0)
  {
    b = "@"; 
    return a.substring(0, 1) + b;
  }
  return a.substring(0, 1) + b.substring(b.length()-1);
}
```
---
#### conCat
- Description:
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
- Solution:
```java
public String conCat(String a, String b) {
  if (a.length() != 0 && b.length() != 0)
  {
    char aLast = a.charAt(a.length()-1);
    char bFirst = b.charAt(0);
    if (aLast == bFirst)
    {
      return a.substring(0, a.length()-1) + b;
    }    
  }
  return a + b;
}
```
---
#### lastTwo
- Description:
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
- Solution:
```java
public String lastTwo(String str) {
  if (str.length() >= 2)
  {
    char last = str.charAt(str.length()-2);
    String word = str.substring(0, str.length()-2) + str.substring(str.length()-1, str.length());
    return word + Character.toString(last);
  }
  return str;
}
```
---
#### seeColor
- Description:
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
- Solution:
```java
public String seeColor(String str) {
  if(str.length() > 2)
  {
    if (str.substring(0, 3).equals("red")) return "red";
    if (str.length() > 3 && str.substring(0,4).equals("blue"))
    {
      return "blue";
     }
  }
  return "";
}
```
---
#### frontAgain
- Description:
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
- Solution:
```java
public boolean frontAgain(String str) {
  if (str.length() >= 2)
  {
    String end = str.substring(str.length()-2, str.length());
    return str.substring(0, 2).equals(end);
  }
  return false;
}
```
---
#### minCat
- Description:
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
- Solution:
```java
public String minCat(String a, String b) {
  int x = a.length();
  int y = b.length();
  if(x > y) return a.substring(x-y, x) + b;
  if(x < y) return a + b.substring(y-x, y);
  return a + b;
}
```
---
#### extraFront
- Description:
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
- Solution:
```java
public String extraFront(String str) {
  if(str.length() >= 2)
  {
    String front = str.substring(0, 2);
    return front + front + front;
  }
  return str + str + str;
}
```
---
#### without2
- Description:
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
- Solution:
```java
public String without2(String str) {
  if (str.length() >= 2)
  {
    String first = str.substring(0, 2);
    String end = str.substring(str.length()-2, str.length());
    if (first.equals(end))
    {
      return str.substring(2, str.length());
    }    
  }
  return str;
}
```
---
#### deFront
- Description:
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
- Solution:
```java
public String deFront(String str) {
  if (str.length() >= 2)
  {
    String end = str.substring(2);
    if(str.charAt(0) == 'a')
    {
      if(str.charAt(1) == 'b'){
        return "ab" + end;
      }
      return "a" + end;
    }
    if(str.charAt(1) == 'b')
    {
        return "b" + end;
    }
    return end;
  }
  return str;
}
```
---
#### startWord
- Description:
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
- Solution:
```java
public String startWord(String str, String word) {
  if (str.length() >= word.length())
  {
    if(str.substring(1, word.length()).equals(word.substring(1)))
    {
      return str.substring(0,word.length());
    }
  }
  return "";
}
```
---
#### withoutX
- Description:
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
- Solution:
```java
public String withoutX(String str) {
  if (str.length() > 0)
  {
    if (str.charAt(0) == 'x')
    {
      if (str.length() == 1)
      {
        return "";
      }
      if (str.charAt(str.length()-1) == 'x')
      {
        return str.substring(1, str.length()-1);
      }
      return str.substring(1);
    }
    if (str.charAt(str.length()-1) == 'x')
    {
      return str.substring(0, str.length()-1);
    }
  }
  return str;
}
```
---
#### withoutX2
- Description:
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
- Solution:
```java
public String withoutX2(String str) {
  if (str.length() > 1 && str.charAt(1) == 'x' && str.charAt(0) != 'x')
  {
    str = str.substring(0,1) + str.substring(2);
  }
  if (str.length() > 0 && str.charAt(0) == 'x')
  {
    str = str.substring(1);
  }
  if (str.length() > 0 && str.charAt(0) == 'x')
  {
    str = str.substring(1);
  }
  return str;
}
```
---
