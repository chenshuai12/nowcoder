package arithmetic;

/**
 * 给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
 */
public class longChildString {

    public int maxLength(int[] arr){
        int[] last = new int[100000];
        int n = arr.length; //父字符串长度
        int res = 0;  //最长无重复子串长度，初始化0
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = arr[i];     //滑动窗口，从第一位开始
            start = Math.max(start, last[index]);
            res   = Math.max(res, i - start + 1);
            last[index] = i+1;
        }
        return res;
    }
}
