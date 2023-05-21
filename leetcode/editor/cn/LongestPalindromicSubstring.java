/**
 * 题目Id: 5
 * 题目: 最长回文子串
 * 日期: 2023-05-17 22:52:12
 */
//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 6495 👎 0

package editor.cn;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        String s = solution.longestPalindrome("a");
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length()  == 0){
                return "";
            }
            int length = 1;
            int left = 0,right = 0;
            int maxLen = 0;
            int star = 0;
            for (int i =0;i < s.length(); i++){
                left = i - 1;
                right = i + 1;
                while (left >= 0 && s.charAt(left) == s.charAt(i)){
                    length++;
                    left--;
                }
                while (right < s.length() && s.charAt(right) == s.charAt(i)){
                    length++;
                    right++;
                }
                while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)){
                    length = length + 2;
                    right++;
                    left--;
                }
                if (length > maxLen){
                    maxLen = length;
                    star = left;
                }
                length = 1;
            }
            return s.substring(star + 1,star + maxLen + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}