package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 明明的随机数
 * @author 陈帅
 */
public class RandomOfMing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            StringBuilder stringBuilder = new StringBuilder();
            int n = Integer.valueOf(str);
            //空间换时间，弄1001个布尔类型的数组
            boolean[] stu = new boolean[1001];
            for (int i = 0; i < n; i++){
                //读取n个数，置每个数对应的数组下标位置为true，达到了去重加排序的目的
                stu[Integer.valueOf(bufferedReader.readLine())] = true;
            }
            for (int i = 1; i < stu.length; i++){
                if (stu[i]){
                    //若为true，说明当前位置的下标是有数字的，所以加上以及换行
                    stringBuilder.append(i).append('\n');
                }
            }
            //去掉最后一个换行符，然后输出
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.println(stringBuilder.toString());
        }
    }
}
