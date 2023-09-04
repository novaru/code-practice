#### Table of Contents
- [stringTimes](#stringTimes)
- [frontTimes](#frontTimes)
- [countXX](#countXX)
- [doubleX](#doubleX)
- [stringBits](#stringBits)
- [stringSplosion](#stringSplosion)
- [last2](#last2)
- [arrayCount9](#arrayCount9)
- [arrayFront9](#arrayFront9)
- [array123](#array123)
- [stringMatch](#stringMatch)
- [stringX](#stringX)
- [altPairs](#altPairs)
- [stirngYak](#stringYak)
- [array667](#array667)
- [noTriples](#noTriples)
- [has271](#has271)
---
#### stringTimes
- Description:
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
- Solution:
```java
public String stringTimes(String str, int n) {
  String result = "";
  for (int i = 0; i < n; i++) result += str;
  return result;
}
```
---
#### frontTimes
- Description:
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
- Solution:
```java
public String frontTimes(String str, int n) {
  String result = "";
  if (str.length() >= 3) 
  {
    str = str.substring(0, 3);
  }
  for (int i = 0; i < n; i++)
  {
    result += str;
  }
  return result;
}
```
---
#### countXX
- Description:
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
- Solution:
```java
int countXX(String str) {
  int n = 0;
  for (int i = 0; i < str.length() - 1; i++)
  {
    if (str.substring(i, i + 2).equals("xx")) n++;
  }
  return n;
}
```
---
#### doubleX
- Description:
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
- Solution:
```java
boolean doubleX(String str) {
  int n = str.indexOf("x");
  if (n >= 0) {
    String s = str.substring(n);
    return s.startsWith("xx");
  }
  return false;
}
```
---
#### stringBits
- Description:
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
- Solution:
```java
public String stringBits(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i += 2)
  {
    result = result + str.charAt(i);
  }
  return result;
}
```
---
#### stringSplosion
- Description:
Given a non-empty string like "Code" return a string like "CCoCodCode".
- Solution:
```java
public String stringSplosion(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) 
  {
    result = result + str.substring(0, i + 1);
  }
  return result;
}
```
---
#### last2
- Description:
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
- Solution:
```java
public int last2(String str) {
  if (str.length() < 2) { return 0 };
  int count = 0;
  String last = str.substring(str.length() - 2);
  for (int i = 0; i < str.length() - 2; i++)
  {
    String sub = str.substring(i, i + 2);
    if(sub.equals(last))
    {
      count++;
    }
  }
  return count;
}
```
---
#### arrayCount9
- Description:
Given an array of ints, return the number of 9's in the array.
- Solution:
```java
public int arrayCount9(int[] nums) {
  int count = 0;
  for (int i : nums) 
  {
    if (i == 9) count++;
  }
  return count;
}
```
---
#### arrayFront9
- Description:
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
- Solution:
```java
public boolean arrayFront9(int[] nums) {
  int len = nums.length;
  if (len > 4) len = 4;
  for (int i = 0; i < len; i++) 
  {
    if (nums[i] == 9) return true;
  }
  return false;
}
```
---
#### array123
- Description:
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
- Solution:
```java
public boolean array123(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++)
  {
    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
    {
      return true;
    }
  }
  return false;
}
```
---
#### stringMatch
- Description:
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
- Solution:
```java
public int stringMatch(String a, String b) {
  int len = Math.min(a.length(), b.length());
  int count = 0;
  for (int i = 0; i < len - 1; i++)
  {
    String subA = a.substring(i, i+2);
    String subB = b.substring(i, i+2);
    if (subA.equals(subB)) count++;
  }
  return count;
}
```
---
#### stringX
- Description:
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
- Solution:
```java
public String stringX(String str) {
  String result = "";  
  for (int i = 0; i < str.length(); i++)
  {
    if (!(i > 0 && i < str.length() - 1 && str.charAt(i) == 'x'))
    {
      result += str.charAt(i);
    }
  }
  return result;
}
```
---
#### altPairs
- Description:
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
- Solution:
```java
public String altPairs(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i += 4) 
  {
    int end = i+2;
    if (end > str.length()) 
    {
      end = str.length();
    }
    result += str.substring(i, end);
  }
  return result;
}
```
#### stringYak
- Description:
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
- Solution:
```java
public String stringYak(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) 
  {
    if (i < str.length()-2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') 
    {
      i = i+2;
    } 
    else result += str.charAt(i);
  }
  return result;
}
```
---
#### array667
- Description:
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
- Solution:
```java
public int array667(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length-1; i++)
  {
    if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
    {
      count++;
    }
  }
  return count;
}
```
---
#### noTriples
- Description:
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
- Solution:
```java
public boolean noTriples(int[] nums) {
  for (int i = 0; i < nums.length-2; i++) 
  {
    if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2])
    {
      return false;
    }
  }
  return true;
}
```
---
#### has271
- Description:
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
- Solution:
```java
public boolean has271(int[] nums) {
  for (int i = 0; i < nums.length-2; i++)
  {
    if (nums[i] + 5 == nums[i+1]) 
    {
      int diff = nums[i] - 1;
      if (Math.abs(diff - nums[i+2]) < 3) return true;
    }
  }
  return false;
}
```
---