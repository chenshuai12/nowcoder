import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = " ";
        int num = Test.lengthOfLongestSubstring("dvdf");
        System.out.println(num);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<String,Boolean> map = new HashMap<>();
        Integer sum = 0;
        for (int i = 0;i <= chars.length - 1; i++){
            for (int j = i; j <= chars.length - 1; j++){
                char c = chars[j];
                if (!map.containsKey(String.valueOf(c))){
                    map.put(String.valueOf(c),true);
                    sum = Math.max(sum,map.size());
                }else {
                    map.clear();
                    break;
                }
            }
        }
        return sum;
    }
}
