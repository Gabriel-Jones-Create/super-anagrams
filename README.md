# Programming Project: Super Anagrams

## Clone Project

Begin by cloning the provided project and importing it into your workspace.

`git clone <url for github repository>`

After cloning this repository you want to run these commands

`git checkout -b development`

This will create a branch named development and switch you to it. The development branch is where you will make all your commits.

## Import into Eclipse

You should then go to Eclipse, which hopefully has finished installing.

In the top toolbar, click File --> Import. Double-click on General and then `Projects from Folder or Archive`. Click `Directory` and find the folder inside the repository named `SuperAnagrams` and click Open. The project should pop up in the text box Projects. Click finish and you should be good to go!

## Complete Super Anagrams Assignment

Two words or phrases in English are anagrams if their letters (and only their letters), rearranged, are the same. We assume that upper and lower case are indistinguishable, and punctuation and spaces don't count. Some examples and non-examples of regular anagrams:

- The eyes / they see (yes)
- moo / mo (no)
- Clint Eastwood / Old west Action! (yes)
- Dormitory / Dirty Room (yes)

Your job for this assignment is to solve a slight variant of the traditional anagram problem called superanagram. Here you are to write a two class application that reads in two words or phrases from the keyboard, and then outputs true if the first phrase is an anagram of some of the letters in the second phrase, false if it is not. Here are some examples:

- mo / moo (true)
- mo / mOO (true - capitalization doesn't matter)
- moo / mo (false - first phrase is NOT an anagram of some (or all) of letters of second)
- rip / ziPPer (true)
- abc / aabc (true)
- aabc / abcde (false - too few a's in the second string)
- flipper / rip (false)
- Clint Eastwood / Old west Action! (true - the two can have exactly the same letters)
- a stitch in time saves nine / is this meant as an incentive? (true)
- narcissism / one man crisis (false- can you see why?)

Example of a program run:

```
Enter a phrase:
> Clint Eastwood
Enter another phrase:
>Old west Action!
true
```

TEST CASES:
This file contains test cases to run your code on when you have it working. Most of the code has been written- you can finish implementing it and use it to fully test your SuperAnagram code. NOTE: do not submit this class to OWL. This is for your testing purposes only. If your code passes all of these tests your code is likely to get max points.

### SuperAnagram Test Cases

Individual test cases- as Java String arrays at bottom of file in case you want to write your own test code.

```
"yes"
"mo"
"moo"

"yes"
"mo"
"mOO"

"no"
"moo"
"mo"

"yes"
"rip"
"ziPPer"

"yes"
"abc"
"aabc"

"no"
"aabc"
"abcde"

"no"
"flipper"
"rip"

"yes"
"Clint Eastwood"
"Old west Action!"

"yes"
"young lad"
"not an old guy"

"yes"
"A Gentleman"
"Is an Elegant Man"

"no"
"silently"
"listen"

"no"
"narcissism"
"one man crisis"

"yes"
"a stitch in time saves nine"
"is this meant as an incentive?"
```

```java
/************************************ Test Arrays *************************
Finish coding this class to test your SuperAnagram.java program.
Note: If your code passes these tests you have done all you can to ensure that your
code works.
We are not including cases of the empty string or strings of a single charcter or when
one of the inputs is null. This filtering could be done before SuperAnagram is used
and is not part of the algorithm.
*/

public class MySuperAnagramTestCases{
  public static void main(String[] args){

     String[] correctResultStr = {"true","true","false","true","true","false","false","true","true","true","false","false","true"};
     String[] firstStr = {"mo","mo","moo","rip","abc","aabc","flipper","Clint Eastwood","young lad","A Gentleman","silently","narcissism","a stitch in time saves nine"};
     String[] secondStr = {"moo","mOO","mo","ziPPer","aabc","abcde","rip","Old west Action!","not an old guy","Is an Elegant Man","listen","one man crisis","is this meant as an incentive?"};

    /*The test algorithm in pseudocode:

	  SuperAnagram mySA = new SuperAnagram();
	  for each test case i {
   	  result = mySA.isSuperAnagram(firstStr[i], secondStr[i]);
        if(result == Boolean.parseBoolean(correctResultStr[i]))
          passedTestStr = "PASSED";
        else
          passedTestStr = "FAILED";
   	  System.out.println("test "+(i+1)+" "+passedTestStr+" "+firstStr[i]+", "+secondStr[i]+" my code: "+result+" correct: "+correctResultStr[i]);
     }
     */
 }
}
```

## PROJECT REQUIREMENTS:

1. Your classes must be called SuperAnTester, and SuperAnagram.

2. Your SuperAnTester class must prompt the user to enter each phrase. It must use a Scanner object to read in the input phrases.

3. Your program must either print true, if the superanagram relationship is satisfied, or false if it isn't. All console Input and Output must be done by the SuperAnTester class.

4. Your SuperAnagram class must have an isSuperAnagram method that returns boolean and takes two String parameters- the phrases to be tested. Your isSuperAnagram method must return true if the superanagram relationship is satisfied, false, if it isn't.

5. Your SuperAnTester class must create an instance of the SuperAnagram class and call its isSuperAnagram method to determine if the input satisfies the superanagram relationship.

6. Your SuperAnagram class must use the default constructor (no parameters) only.

7. You must use one or more array(s) as in an essential way in your solution to this project. For example, major point deduction for using many conditional statements instead of an array.

8. You may NOT import and use the ArrayList class for this project. Major point deduction for this. Note that an array is not the same thing as an ArrayList.

9. Your code must NOT be case sensitive- assume that upper and lower case are indistinguishable, and punctuation and spaces are ignoired.

Some tips:

- Remember to use the nextLine method, rather than next, since spaces may be present in the two phrases that are submitted.
- Use the String methods toLowerCase and, possibly, toCharArray. (Consult the Java API).
- Punctuation and any characters other than letters a-z are ignored.
- Very important: suppose you have two arrays of characters such that the first is purported to be an embedded anagram of the second, in the sense we've described above. How can you tell? The single most important thing to do, before you write a single line of code, is to work out a paper and pencil algorithm that distinguishes between superanagrams and non-superanagrams.
- Algorithm Idea #1: make a scoreboard for the letters a to z. Every time you encounter a letter in the second String, up its count by 1; Then, every time you encounter a letter in the first String, lower its count by 1. Accept if the scoreboard ends up with all entries >= 0. (of course make sure you understand why this is - use pencil and paper to convince yourself!!).
- Algorithm Idea #2: convert strings to arrays. March down first array (representing the first string). When you encounter a letter, look for it in the second array. If you find it, blank out the occurrence in the second array; if you don't find it - it's not a super anagram. When you're all done, you've got a superanagram if your search in the second array never goes bad.
- Run all of the test cases provided on your solution. You can write code to use the arrays to test your SuperAnagram class. Follow the pseudocode provided. Note that this is an optional suggestion.

## Notes

- You need to comment your methods according to this [Javadoc Guide](https://github.com/jd12/liferay-portal/blob/master/readme/ADVANCED_JAVADOC_GUIDELINES.markdown).
