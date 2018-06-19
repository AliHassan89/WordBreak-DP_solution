# WordBreak-DP_solution

Given a non-empty string s and a dictionary wordDict containing a list of 
non-empty words, determine if s can be segmented into a space-separated sequence 
of one or more dictionary words. You may assume the dictionary does not contain 
duplicate words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

# Solution:

1. A string and a list is received as function parameter.

2. The problem is solved using dynamic programming via bottom up approach. We will take first step by creating a memo boolean array whose size will be length of string + 1. </br>
boolean[] f = new boolean[s.length() + 1];

3. Then we initialize memo[0] = true, that is because we know that in order to create word of length 0 we don't need to look into list of words.

4. we start a loop from index 1 to end of string length.

5. A nested loop which will start from 0 to i.

6. It is then checked if f[j] is true and list contains the word from index j to i. If so then that means we have successfully found a word which is present in list and also in the string. We mark f[i] = true and break from the inner loop. </br>
if(f[j] && wordDict.contains(s.substring(j, i)))</br>
{</br>
	f[i] = true;</br>
	break;</br>
}</br>

7. Lastly we return f[string.length()];. If it will be true then that means we have found the string in list of words.
