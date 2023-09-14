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

---
### monkeyTrouble
- Description:
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
- Solution:

---
### sumDouble
- Description:
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
- Solution:

---
### diff21
- Description:
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
- Solution:

---
### parrotTrouble
- Description:
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
- Solution:

---
### makes10
- Description:
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
- Solution:

---
### nearHundred
- Description:
Given an int n, return true if it is within 10 of 100 or 200. Note: `Math.abs(num)` computes the absolute value of a number.
- Solution:

---
### posNeg
- Description:
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
- Solution:

---
### notString
- Description:
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: `use .equals()` to compare 2 strings.
- Solution:

---
### missingChar
- Description:
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range `0 ... str.length()-1` inclusive).
- Solution:

---
### frontBack
- Description:
Given a string, return a new string where the first and last chars have been exchanged.
- Solution:

---
### front3
- Description:
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
- Solution:

---
### backAround
- Description:
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
- Solution:

---
### or35
- Description:
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see [Introduction to Mod](https://codingbat.com/doc/practice/mod-introduction.html)
- Solution:

---
### front22
- Description:
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
- Solution:

---
### startHi
- Description:
Given a string, return true if the string starts with "hi" and false otherwise.
- Solution:

---
### icyHot
- Description:
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
- Solution:

---
### in1020
- Description:
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
- Solution:

---
### hasTeen
- Description:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
- Solution:

---
### loneTeen
- Description:
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
- Solution:

---
### delDel
- Description:
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
- Solution:

---
### mixStart
- Description:
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
- Solution:

---
### startOz
- Description:
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
- Solution:

---
### intMax
- Description:
Given three int values, a b c, return the largest.
- Solution:

---
### close10
- Description:
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that `Math.abs(n)` returns the absolute value of a number.
- Solution:

---
### in3050
- Description:
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
- Solution:

---
### max1020
- Description:
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
- Solution:

---
### stringE
- Description:
Return true if the given string contains between 1 and 3 'e' chars.
- Solution:

---
### lastDigit
- Description:
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
- Solution:

---
### endUp
- Description:
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that `str.toUpperCase()` returns the uppercase version of a string.
- Solution:

---
### everyNth
- Description:
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
- Solution:

---
