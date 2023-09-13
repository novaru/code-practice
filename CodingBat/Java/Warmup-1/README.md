## Table of Contents
- [sleepIn](#sleepIn)
- [monkeyTrouble](#monkeyTrouble)
- [sumDouble](#sumDouble)
- [diff21](#diff21)
- [parrotTrouble](#parrotTrouble)
- [makes10](#makes10)
- [nearHundred](#nearHundred)
- [posNeg](#posNeg)
- [notString](#notString)
- [missingChar](#missingChar) 
- [frontBack](#frontBack)
- [front3](#front3)
- [backAround](#backAround)
- [or35](#or35)
- [front22](#front22)
- [startHi](#startHi)
- [icyHot](#icyHot)
- [in1020](#in1020)
- [hasTeen](#hasTeen)
- [loneTeen](#loneTeen)
- [delDel](#delDel)
- [mixStart](#mixStart)
- [startOz](#startOz)
- [intMax](#intMax)
- [close10](#close10)
- [in3050](#in3050) 
- [max1020](#max1020)
- [stringE](#stringE)
- [lastDigit](#lastDigit) 
- [endUp](#endUp)
- [everyNth](#everyNth)
---
### sleepIn
- Description:
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
- Solution:
```java
public boolean sleepIn(boolean weekday, boolean vacation) {
  return (!weekday | vacation);
}
```
---
### monkeyTrouble
- Description:
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
- Solution:
```java
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return !(aSmile ^ bSmile);
}
```
---
### sumDouble
- Description:
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
- Solution:
```java
public int sumDouble(int a, int b) {
  if (a != b) return a+b;
  return 2 * (a + b);
}
```
---
### diff21
- Description:
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
- Solution:
```java
public int diff21(int n) {
  if (n <= 21) return 21 - n;
  return 2 * (n - 21);
}
```
---
### parrotTrouble
- Description:
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
- Solution:
```java
public boolean parrotTrouble(boolean talking, int hour) {
return (talking & (hour < 7 | hour > 20));
}
```
---
### makes10
- Description:
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
- Solution:
```java
public boolean makes10(int a, int b) {
  return (a+b == 10 || (a == 10 || b == 10));
}
```
---
### nearHundred
- Description:
Given an int n, return true if it is within 10 of 100 or 200. Note: `Math.abs(num)` computes the absolute value of a number.
- Solution:
```java
public boolean nearHundred(int n) {
  return(10 >= Math.abs(100 - n) || 10 >= Math.abs(200 - n));
}
```
---
### posNeg
- Description:
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
- Solution:
```java
public boolean posNeg(int a, int b, boolean negative) {
  if (negative) return (a < 0 && b < 0);
  return (a < 0 ^ b < 0 && !negative);
}
```
---
### notString
- Description:
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: `use .equals()` to compare 2 strings.
- Solution:
```java
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not"))
  {
    return str;
  }
  return "not " + str;
}
```
---
### missingChar
- Description:
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range `0 ... str.length()-1` inclusive).
- Solution:
```java
public String missingChar(String str, int n) {
  String str1 = str.substring(0, n);
  String str2 = str.substring(n + 1, str.length());
  return str1 + str2;
}
```
---
### frontBack
- Description:
Given a string, return a new string where the first and last chars have been exchanged.
- Solution:
```java
public String frontBack(String str) {
  if (str.length() >= 2)
  {
    String center = str.substring(1, str.length() - 1);
    return str.charAt(str.length() - 1) + center + str.charAt(0);
  }
  return str;
}
```
---
### front3
- Description:
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
- Solution:
```java
public String front3(String str) {
  StringBuilder sb = new StringBuilder();
  if (str.length() > 3)
  {
    str = str.substring(0,3);
    for (int i=0; i<3; i++)
    {
      sb.append(str);
    }
    str = sb.toString();
    return str;
  } 
  else if (str.length()>0)
  {
    for (int i=0; i<3;i++)
    {
      sb.append(str);
    }
    str = sb.toString();
    return str;
  }
  return str;
}
```
---
### backAround
- Description:
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
- Solution:
```java
public String backAround(String str) {
  char side = str.charAt(str.length() - 1);
  return side + str + side;
}
```
---
### or35
- Description:
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see [Introduction to Mod](https://codingbat.com/doc/practice/mod-introduction.html)
- Solution:
```java
public boolean or35(int n) {
  return (n % 3 == 0 || n % 5 == 0);
}
```
---
### front22
- Description:
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
- Solution:
```java
public String front22(String str) {
  if (str.length() < 2)
  {
    return str + str + str;
  }
  String front = str.substring(0, 2);
  return front + str + front;
}
```
---
### startHi
- Description:
Given a string, return true if the string starts with "hi" and false otherwise.
- Solution:
```java
public boolean startHi(String str) {
  if (str.length() >= 2)
  {
    String front = str.substring(0, 2);
    return (front.equals("hi"));
  }
  return false;
}
```
---
### icyHot
- Description:
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
- Solution:
```java
public boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100);
}
```
---
### in1020
- Description:
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
- Solution:
```java
public boolean in1020(int a, int b) {
  return (10 <= a && a <= 20 || 10 <= b && b <= 20);
}
```
---
### hasTeen
- Description:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
- Solution:
```java
public boolean hasTeen(int a, int b, int c) {
  return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
}
```
---
### loneTeen
- Description:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
- Solution:
```java
public boolean loneTeen(int a, int b) {
  return (13 <= a && a <= 19) ^ (13 <= b && b <= 19);
}
```
---
### delDel
- Description:
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
- Solution:
```java
public String delDel(String str) {
  if (str.length() >= 4 && str.substring(1, 4).equals("del"))
  {
    return str.charAt(0) + str.substring(4);
  }
  return str;
}
```
---
### mixStart
- Description:
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
- Solution:
```java
public boolean mixStart(String str) {
  if(str.length() >= 3)
  {
      return(str.substring(1, 3).equals("ix")); 
  }
  return false;
}
```
---
### startOz
- Description:
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
- Solution:
```java
public String startOz(String str) {
  if (str.length() < 2)
  {
    return str; 
  }
  else if (str.substring(0, 2).equals("oz"))
  {
    return "oz";
  }
  else if (str.charAt(0) == 'o')
  {
    return "o";
  }
  else if (str.substring(1, 2).equals("z"))
  {
    return "z";
  }
  return "";
}
```
---
### intMax
- Description:
Given three int values, a b c, return the largest.
- Solution:
```java
public int intMax(int a, int b, int c) {
  int num[] = new int[3];
  num[0] = a;
  num[1] = b;
  num[2] = c;
  int max = num[0];
  for (int i = 0; i < num.length; i++)
  {
    if (num[i] > max)
    {
      max = num[i];
    }
  }
  return max;
}
```
---
### close10
- Description:
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that `Math.abs(n)` returns the absolute value of a number.
- Solution:
```java
public int close10(int a, int b) {
  if (Math.abs(10 - a) < Math.abs(10 - b)) return a;
  if (Math.abs(10 - a) > Math.abs(10 - b)) return b;
  return 0;
}
```
---
### in3050
- Description:
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
- Solution:
```java
public boolean in3050(int a, int b) {
  return (a >= 30 && a <= 40 && b >= 30 && b <= 40 || a >= 40 && a <= 50  && b >= 40 && b <= 50);
}
```
---
### max1020
- Description:
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
- Solution:
```java
public int max1020(int a, int b) {
  if (10 <= a && a <= 20 || 10 <= b && b <= 20)
  {
    if (10 <= a && a <= 20 && !(10 <= b && b <= 20)) return a;
    if (!(10 <= a && a <= 20) && 10 <= b && b <= 20) return b;
    return (Math.max(a, b));
  }
  return 0;
}
```
---
### stringE
- Description:
Return true if the given string contains between 1 and 3 'e' chars.
- Solution:
```java
public boolean stringE(String str) {
  int count = 0;
  for (int i=0; i<str.length(); i++){
    if (str.charAt(i)=='e'){
      count++;
      // str.substring(i, i+1).equals("e");
    }
  }
  return (1<=count && count<=3);
}
```
---
### lastDigit
- Description:
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
- Solution:
```java
public boolean lastDigit(int a, int b) {
  return(a % 10 == b % 10);
}
```
---
### endUp
- Description:
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that `str.toUpperCase()` returns the uppercase version of a string.
- Solution:
```java
public String endUp(String str) {
  if (str.length() >= 3)
  {  
    String front = str.substring(0, str.length() - 3);
    String end = str.substring(str.length() - 3, str.length()).toUpperCase();
    return front + end;
  } 
  return str.toUpperCase();
}
```
---
### everyNth
- Description:
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
- Solution:
```java
public String everyNth(String str, int n) {
  String result = "";
  for (int i=0; i<str.length(); i += n){
    result = result + str.charAt(i);
  }
  return result;
}
```
---
