package com.company;
import java.util.*;

public class ValidSubsequence {
    /**
     validate subsequence
     {
     "array": [5, 1, 22, 25, 6, -1, 8, 10],
     "sequence": [1, 6, -1, 10, 11, 11, 11, 11]
     }
     false
     **/

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        boolean isFound = false;
        if(array != null && sequence != null)
        {
            int j = 0;
            if(sequence.size() > array.size())
                return false;
            for(Integer i = 0; i < array.size(); i++)
            {
                if(j < sequence.size() && j < array.size() && array.get(i) == sequence.get(j))
                {
                    j++; // if found, increment j, else if j ends up shorter then sequence then return false
                }
            }

            return (j == sequence.size());
        }

        return false;
    }

}
