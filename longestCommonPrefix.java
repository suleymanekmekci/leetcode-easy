class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int maximumLength = Integer.MAX_VALUE;
        
        for (String str : strs) {
            maximumLength = Math.min(maximumLength,str.length());
        }
        
        String output = "";
        if (maximumLength == 0 || strs.length == 0){
            return output;
        }
        for (int i = 0; i < maximumLength;i++) {
            char letter = strs[0].charAt(i);
            boolean isSame = true;
            for (String str : strs) {
                if (str.charAt(i) != letter) {
                    isSame = false;
                    break;
                }
                
            }
            if (isSame) {
                output += String.valueOf(letter);
            }
            else {
                break;
            }
            
        }
        return output;
        
        
        
    }
}
