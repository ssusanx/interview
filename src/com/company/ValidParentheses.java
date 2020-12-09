package com.company;


import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
	// write your code here
    }

    class Solution {
        public boolean isValid(String s) {
            Stack stack = new Stack();
            if(s != null)
            {
                for(char c : s.toCharArray() )
                {
                    if(c== '(' || c == '{' || c == '[')
                        stack.push(c);
                    else
                    {
                        if(!stack.empty())
                        {
                            char a = (char)stack.pop();
                            if( c == ')' && '(' == a)
                                continue;
                            else if( c == '}' && '{' == a)
                                continue;
                            else if( c == ']' && '[' == a)
                                continue;
                            else
                                return false;
                        }
                        else
                            return false;

                    }
                }
                return stack.empty();
            }

            return false;
        }
    }
}
