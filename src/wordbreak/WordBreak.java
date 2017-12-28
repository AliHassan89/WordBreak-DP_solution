/*

Given a non-empty string s and a dictionary wordDict containing a list of 
non-empty words, determine if s can be segmented into a space-separated sequence 
of one or more dictionary words. You may assume the dictionary does not contain 
duplicate words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

 */
package wordbreak;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali_Hassan_Syed
 */
public class WordBreak 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        
        System.out.println(wordBreak("leetcode", list));
    }
    
    public static boolean wordBreak(String s, List<String> wordDict) 
    {
        boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;
        
        for(int i=1; i <= s.length(); i++)
        {
            for(int j=0; j < i; j++)
            {
                if(f[j] && wordDict.contains(s.substring(j, i)))
                {
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
    }
    
}
