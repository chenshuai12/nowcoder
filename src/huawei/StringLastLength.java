package huawei;

import java.io.IOException;
import java.io.InputStream;

/**
 * 最后一个字符串的长度
 * @author 陈帅
 */
public class StringLastLength {
    public static void main(String[] args) throws IOException {
        int length = 0;
        InputStream in = System.in;
        char c = (char) in.read();
        while (c != '\n'){
            if (c == ' '){
                length = 0;
            }else {
                length++;
            }
            c = (char) in.read();
        }
        System.out.println(length);
    }
}
