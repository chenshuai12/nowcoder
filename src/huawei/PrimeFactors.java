package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 质数因子
 * 180
 * 2 2 3 3 5
 * @author 陈帅
 */
public class PrimeFactors {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder result = new StringBuilder();
        while ((str = bufferedReader.readLine()) != null){
            long value = Long.parseLong(str);
            for (int i = 2; i <= Math.sqrt(value); i++){
                if (value % i == 0){
                    result.append(i).append(' ');
                    value = value / i;
                    i--;
                }
            }
            result.append(value).append(' ');
            System.out.println(result.toString());
        }
    }
}
