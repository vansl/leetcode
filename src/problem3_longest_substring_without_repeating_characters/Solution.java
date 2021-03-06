package problem3_longest_substring_without_repeating_characters;

import java.util.HashMap;

/**
 * @author: vansl
 * @create: 18-7-24 下午8:36
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index = 0;
        int maxLength = 0;
        int currentLength = 0;
        HashMap<Character,Integer> exist = new HashMap<>(128);
        while (index<s.length()){
            char c = s.charAt(index++);
            if(exist.containsKey(c)){
                int preIndex = exist.get(c);
                currentLength = index-preIndex-1;
                exist = new HashMap<>(128);
                for (int i=preIndex;i<index;i++){
                    exist.put(s.charAt(i),i);
                }
                exist.replace(c,index-1);
            }else{
                exist.put(c,index-1);
                currentLength++;
            }
            if (currentLength>maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new Solution().lengthOfLongestSubstring("bbbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("abcdaef"));
        System.out.println(new Solution().lengthOfLongestSubstring(""));
    }
}
