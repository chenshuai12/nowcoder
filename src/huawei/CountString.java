package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 计算字符串中出现指定字符的个数
 * @author 陈帅
 */
public class CountString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        char c = bufferedReader.readLine().toCharArray()[0];
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == c || chars[i] == c - 32){
                count++;
            }
        }
        System.out.println(count);
    }
}
