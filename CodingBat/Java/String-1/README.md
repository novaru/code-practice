## Table of Contents
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
### helloName
- Description

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/atFirst.java#L1-L8
---
### makeAbba
- Description

Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
- Solution:
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/makeAbba.java#L1-L3
---
### makeTags
- Description

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
- Solution:
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/makeTags.java#L1-L3
---
### makeOutWord
- Description

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<\<word>\>". Note: use `str.substring(i, j)` to extract the String starting at index i and going up to but not including index j.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/makeOutWord.java#L1-L3
---
### extraEnd
- Description

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/extraEnd.java#L1-L4
---
### firstTwo
- Description

Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that `str.length()` returns the length of a string.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/firstTwo.java#L1-L6
---
### firstHalf
- Description

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/firstHalf.java#L1-L3
---
### withoutEnd
- Description

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/withoutEnd.java#L1-L3
---
### comboString
- Description

Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/comboString.java#L1-L8
---
### nonStart
- Description

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/nonStart.java#L1-L5
---
### left2
- Description

Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/left2.java#L1-L8
---
### right2
- Description

Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/right2.java#L1-L8
---
### theEnd
- Description

Given a string, return a string length 1 from its front, unless **front** is false, in which case return a string length 1 from its back. The string will be non-empty.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/theEnd.java#L1-L6
---
### withouEnd2
- Description

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/withoutEnd2.java#L1-L6
---
### middleTwo
- Description

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/middleTwo.java#L1-L4
---
### endsLy
- Description

Given a string, return true if it ends in "ly".
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/endsLy.java#L1-L7
---
### nTwice
- Description

Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/nTwice.java#L1-L8
---
### twoChar
- Description

Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/twoChar.java#L1-L6
---
### middleThree
- Description

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/middleThree.java#L1-L9
---
### hasBad
- Description

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use `.equals()` to compare 2 strings.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/hasBad.java#L1-L8
---
### atFirst
- Description

Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/atFirst.java#L1-L8
---
### lastChars
- Description

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/lastChar.java#L1-L12
---
### conCat
- Description

Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/conCat.java#L1-L10
---
### lastTwo
- Description

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/lastTwo.java#L1-L8
---
### seeColor
- Description

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/seeColor.java#L1-L13
---
### frontAgain
- Description

Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/frontAgain.java#L1-L7
---
### minCat
- Description

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/minCat.java#L1-L10
---
### extraFront
- Description

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/extraFront.java#L1-L7
---
### without2
- Description

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/without2.java#L1-L10
---
### deFront
- Description

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/deFront.java#L1-L15
---
### startWord
- Description

Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
- Solution
https://github.com/novaru/code-practice/blob/d01fa34eb442fe2134e0b2494bd78dcc89703b6a/CodingBat/Java/String-1/src/startWord.java#L1-L10
---
### withoutX
- Description

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/withoutX.java#L1-L8
---
### withoutX2
- Description

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
- Solution
https://github.com/novaru/code-practice/blob/442944caa27f04a42307bfd1c0985e3534a37de2/CodingBat/Java/String-1/src/withoutX2.java#L1-L12
---
