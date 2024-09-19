# Palindrome-PigLatin-and-Shorthand

### Assignment: String Manipulations - Palindromes, Pig Latin, and Shorthand

#### Overview
In this assignment, you will create a class that performs several different operations on strings. All the methods will be **static** and the class will behave similarly to the `Math` class. You will define four public methods, and any helper methods should be private, as they are used internally within the class.

#### Requirements
Create a class called `StringManipulator` that contains the following public methods:

---

### 1. **Reverse String**
Write a method that receives a `String` and returns a `String` that is the exact reversal of the characters in the original `String`.

#### Method Signature:
```java
public static String reverse(String input)
```

---

### 2. **Palindrome Check**
Write a method that receives a `String` and returns `true` if the `String` is a palindrome and `false` if it is not. 

A palindrome is a word or phrase that reads the same forward and backward, ignoring punctuation, spaces, and capitalization.

#### Method Signature:
```java
public static boolean isPalindrome(String input)
```

#### Implementation Details:
- Ignore spaces and punctuation.
- Convert all letters to lower-case before checking.
- Consider only alphabetic characters (a - z, A - Z) and numbers (0 - 9) as valid text.

#### Example Inputs:
- **"radar"** ➞ `true`
- **"Lewd did I live, & evil I did dwel."** ➞ `true`
- **"I like Java"** ➞ `false`
- **"Straw? No, too stupid a fad, I put soot on warts."** ➞ `true`

---

### 3. **Pig Latin Conversion**
Write a method that converts a `String` to **Pig Latin**. If there are multiple words, each word should be converted individually, and the sentence should be reassembled in Pig Latin.

#### Pig Latin Rules:
- If a word contains no vowels, append `"ay"` to the end of the word.
- If a word starts with a vowel, append `"yay"` to the word.
- If a word starts with a consonant, move all the consonants before the first vowel to the end of the word, and then append `"ay"`.
- If the original word is capitalized, the first letter of the Pig Latin word should also be capitalized.

#### Method Signature:
```java
public static String toPigLatin(String input)
```

#### Example Inputs:
- **"Hello"** ➞ `"Ellohay"`
- **"Java"** ➞ `"Avajay"`
- **"My name is David"** ➞ `"Myay amenay isyay Avidday"`

---

### 4. **Shorthand Notation**
Write a method that receives a `String` and returns the string converted into shorthand.

#### Shorthand Rules:
- Replace the word **"and"** with `"&"`.
- Replace the word **"to"** with `"2"`.
- Replace the word **"you"** with `"U"`.
- Replace the word **"for"** with `"4"`.
- Remove all vowels (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`, both lowercase and uppercase).

#### Method Signature:
```java
public static String toShorthand(String input)
```

#### Example Inputs:
- **"I need to talk to you and ask for help"** ➞ `" nd 2 tlk 2 U & sk 4 hlp"`

---

### Additional Notes:
- All public methods must be **static**.
- Helper methods that are used internally should be **private**.
- **Input Validation**: You can assume valid inputs for this assignment.

#### Sample Palindrome Phrases:
Use the following phrases to test your palindrome-checking method:
1. **"radar"**
2. **"J"**
3. **"Lewd did I live, & evil I did dwel."**
4. **"I like Java"**
5. **"Straw? No, too stupid a fad, I put soot on warts."**

#### Reference:
For more information on the world's longest palindrome, see: [http://www.norvig.com/palindrome.html](http://www.norvig.com/palindrome.html)

