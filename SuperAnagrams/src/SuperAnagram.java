public class SuperAnagram {
	char[] matchArray; // creates a character array for the string that must match
	char[] initialArray; // creates a character array for the string the match array must match
	int[] scoreboard = new int[26]; // creates an integer array with 26 positions to represent every letter of the alphabet
		public SuperAnagram() {
		}
		/**
		 * Returns boolean value based on whether or not the first input is a super Anagram of the second input
		 * @param initMatch string that is tested against second string
		 * @param initInitial string that the first string is being testing against 
		 * @return <code>true</code> if the first input is a super anagram of the second;
         *<code>false</code> otherwise
		 */
		public boolean isSuperAnagram(String initMatch,String initInitial){
			// creates a character array out of the input string and sets it to the initial array
			initialArray = initInitial.toCharArray(); 
			// creates a character array out of the input string and sets it to the match array
			matchArray = initMatch.toCharArray();
			//creates a working character array and sets it to the respective other character array with only lower case letters
			char[] workingInitArr = simplify(initialArray);
			char[] workingMatchArr = simplify(matchArray);
			// sets the respective working arrays to the same array but without blank spaces
			workingInitArr = deleteBlanks(workingInitArr);
			workingMatchArr = deleteBlanks(workingMatchArr);
			//for every character in the workingInitArray the index of the ASCII code of the letter is added to the score board array
			for(int i = 0; i < workingInitArr.length; i++) {
				scoreboard[workingInitArr[i]-97]++;
			}
			//for every character in the workingMatchArr the index of the ASCII code of the letter is subtracted from the score board array
			for(int i = 0; i < workingMatchArr.length; i++) {
				scoreboard[workingMatchArr[i]-97]--;
			}
			// for every value in the score board array, if the number is less than 0 then the the input is not a super anagram, otherwise, it is.
			for(int i = 0; i < scoreboard.length; i++) {
				if(scoreboard[i] < 0) {
					return false;
				}
			}
			return true;
		}
		/** 
		 * Returns a character array exclusively with lower case letters
		 * @param ch character array that may have spaces, numbers, or special characters
		 * @return the character array with exclusively lower case letters
		 */
		private char[] simplify(char[] ch) {
			//creates a character array with the length of the input array
			char[] simplified = new char[ch.length];
			//creates iter variable that tracks how many values are characters
			int iter = 0;
			// for every value in the ch array, if the value is a letter then it adds that to the simplified character array, otherwise it does nothing
			for(int i = 0; i < ch.length; i++) {
				if(Character.isLetter(ch[i]) && !Character.isSpaceChar(ch[i])) {
					simplified[iter] = Character.toLowerCase(ch[i]);
					iter++;
				}
			}
			return simplified;
		}
		/**
		 * Returns a character array without blank spaces
		 * @param ch character array that may have blank values
		 * @return the character array without blank spaces
		 */
		private char[] deleteBlanks(char[] ch) {
			//creates lastLetterIndex at the index of the last letter of the input
			int lastLetterIndex = ch.length;
			// for the length of the input array, if the character is not a letter then the last letter index is taken down by 1
			for(int i = 0; i < ch.length; i++) {
				if(!Character.isLetter(ch[i])){
					lastLetterIndex--;
				}
			}
			// creates a newArray variable which is the length of the lastLetterIndex
			char[] newArray = new char[lastLetterIndex];
			//for the length of the last letter, the newArray gets set the the input array's values
			for(int i = 0; i < lastLetterIndex; i++) {
				newArray[i] = ch[i];
			}
			return newArray;
			
		}
	}
