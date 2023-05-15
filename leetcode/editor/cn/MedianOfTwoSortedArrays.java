/**
  * 题目Id: 4
  * 题目: 寻找两个正序数组的中位数
  * 日期: 2023-05-15 22:35:26
*/
//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 6524 👎 0

package editor.cn;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2,3};
        solution.findMedianSortedArrays(nums1,nums2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum = m + n;
        int[] all = new int[m + n];
        if (m == 0){
            if (n % 2 == 0){
                return (nums2[n/2 - 1] + nums2[n/2]) / 2.0;
            }else {
                return nums2[n/2];
            }
        }
        if (n == 0){
            if (m % 2 == 0){
                return (nums1[m/2 - 1] + nums1[m/2]) / 2.0;
            }else {
                return nums1[m/2];
            }
        }
        int i = 0, j = 0,k = 0;
        while (k != m + n){
            if (i == nums1.length){
                // 把nums2补充在后面
                for (;j < nums2.length;){
                    all[k] = nums2[j];
                    k++;j++;
                }
                break;
            }
            if (j == nums2.length){
                for (; i < nums1.length; ){
                    all[k] = nums1[i];
                    k++;i++;
                }
                break;
            }
            if (nums1[i] <= nums2[j]){
                all[k] = nums1[i];
                i++;k++;
            }else {
                all[k] = nums2[j];
                j++;k++;
            }
        }
        if (all.length % 2 == 0){
            return (all[sum/2 - 1] + all[sum/2]) / 2.0;
        }
        return all[sum/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}