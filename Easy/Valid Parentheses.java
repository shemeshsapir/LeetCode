/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/


//Solution
public class Solution {
    public boolean isValid(String s)
    {
        Stack<Character> open = new Stack<>();
        int openCount = 0, closeCount = 0;
        int size = s.length();
        
        //check String size
        if(size % 2 != 0)
            return false;
        
        
        for(int i = 0 ; i < s.length() ; i++)
        {
        	char ch = s.charAt(i);
        	if(ch == '[' || ch == '(' || ch == '{')
        	{
        		open.add(ch);
        		openCount++;
        	}
        	
        	if(ch == ']' || ch == ')' || ch == '}')
        	{
        		closeCount++;
        		if(!open.isEmpty())
        		{
        			char popChar = open.pop();
        			if(popChar == ' ')
        				return false;
            		switch(ch)
            		{
            		case ']':
            			if(popChar != '[')
            				return false;
            			break;
            		case ')':
            			if(popChar != '(')
            				return false;
            			break;
            		case '}':
            			if(popChar != '{') 
            				return false;
            			break;
            		}
        		}
        	}
        }
        
        if(openCount != closeCount || !open.isEmpty())
        	return false;
        else
        	return true;
    }
}
