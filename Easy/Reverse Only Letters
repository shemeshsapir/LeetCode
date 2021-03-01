/*
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Note:

S.length <= 100
33 <= S[i].ASCIIcode <= 122 
S doesn't contain \ or "
*/

//Solution
class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder str = new StringBuilder(S);
	     Stack<Character> stack = new Stack<>();
	     
		 for(int i=0; i<S.length();i++)
		 {
			 if ((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='A' && S.charAt(i)<='Z'))
			 {
				 stack.push(S.charAt(i));
			 }
		 }
		 for(int i=0; i<S.length();i++)
		 {
			 if ((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='A' && S.charAt(i)<='Z'))
			 {
				 str.setCharAt(i,stack.pop());
			 }
			 else
			 {
				 str.setCharAt(i,S.charAt(i));
			 }
		 }
		 
		 return str.toString();
        
    }
}
