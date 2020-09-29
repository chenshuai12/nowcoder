package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 进制转换
 * 接收16进制数，转为10进制数
 * @author 陈帅
 */
public class SysConvert {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            str = str.substring(2,str.length());
            char[] chars = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < chars.length; i++){
                if (chars[i] >= 65){
                    sum =  sum + (int)((chars[i] - 65 + 10) * Math.pow(16,str.length() - i - 1));
                }else {
                    sum = sum + (int) ((chars[i] - 48) * Math.pow(16, str.length() - i - 1));
                }
            }
            System.out.println(sum);
        }
    }
}
