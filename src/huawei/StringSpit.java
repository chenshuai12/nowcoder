package huawei;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符串分割
 * 每一个行缺的补齐
 * 多的裁剪输出然后去掉
 * @author 陈帅
 */
public class StringSpit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            StringBuilder stringBuilder = new StringBuilder(str);
            while (stringBuilder.length() >= 8){
                System.out.println(stringBuilder.substring(0,8));
                stringBuilder.delete(0,8);
            }
            if (stringBuilder.length() > 0){
                stringBuilder.append("00000000");
                System.out.println(stringBuilder.substring(0,8));
            }
        }
    }
}
