package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 取近似值
 * @author 陈帅
 */
public class TheApproximation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while ((str = bufferedReader.readLine()) != null){
            int index = str.indexOf(".");
            int suf = str.substring(index + 1).toCharArray()[0] - 48;
            int pre = Integer.parseInt(str.substring(0,index));
            if (suf < 5){
                System.out.println(pre);
            }else {
                System.out.println(pre + 1);
            }
        }
    }
}
