package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 合并表记录
 * @author 陈帅
 */
public class MergeTableRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            HashMap<Integer, Integer> map = new HashMap();
            int count = Integer.valueOf(str);
            for (int i = 0; i < count; i++){
                String res = bufferedReader.readLine();
                String[] chars = res.split(" ");
                if (map.containsKey(Integer.valueOf(chars[0]))){
                    map.put(Integer.valueOf(chars[0]),map.get(Integer.valueOf(chars[0])) + Integer.valueOf(chars[1]));
                }else {
                    map.put(Integer.valueOf(chars[0]),Integer.valueOf(chars[1]));
                }

            }
            for (Integer key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
