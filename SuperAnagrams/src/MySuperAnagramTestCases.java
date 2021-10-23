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