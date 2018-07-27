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
                currentLength = index-exist.get(c);
                System.out.println(c+" "+currentLength);
                exist = new HashMap<>(128);
            }
            exist.put(c,index);
            currentLength++;
            if (currentLength>maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
    }
}
