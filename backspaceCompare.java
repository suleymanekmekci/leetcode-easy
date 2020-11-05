/* 844. Backspace String Compare
https://leetcode.com/problems/backspace-string-compare/

Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
*/

class backspaceCompare {
    
   
    public boolean backspaceCompare(String S, String T) {
        
        String stringS = findString(S);
        String stringT = findString(T);
        
        return stringS.equals(stringT);
        
    }
    
    public String findString(String string) {// ab#c
        String commonReversed = ""; // ca
        
        int willBeDeleted = 0; // 0
       
        
        for (int i = string.length() - 1 ; i >= 0; i--) {
            char letter = string.charAt(i); // a
            
            if (letter == '#') {
                willBeDeleted++;
            }
            
            
            if (willBeDeleted > 0){
                if (letter == '#') {
                    continue;

                }
                
                willBeDeleted--;
                continue;

                
            }
            
            commonReversed += String.valueOf(letter);
            
        }
        
        return commonReversed;
        
        

    }
}
