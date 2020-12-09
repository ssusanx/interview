package com.company.sliding.window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWORepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int end = 0; end < s.length() ; end++)
        {
            Character c = s.charAt(end);
            if(!set.contains(c))
            {
                set.add(c);
                max++;
            }else
            {
                //if char is found in set, calc the max length
                max = end - start;
                start++; // slide the new start down
                end = start; // reset the new end the start
                set.clear();
            }

        }
        return max;
    }

}
