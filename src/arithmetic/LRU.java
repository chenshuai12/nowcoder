package arithmetic;

import java.util.*;

/***
 * 设计LRU缓存结构
 */
public class LRU {

    private Map<Integer,Integer> data = new LinkedHashMap<>();
    public int[] LRU (int[][] operators,int k){

        List<Integer> list = new ArrayList<>();
        int len = operators.length;
        for (int i = 0; i < operators.length; i++){
            int[] item = operators[i];
            int operType = item[0];
            int operkey = item[1];
            if (operType == 1){
                set(operkey,item[2],k);
                continue;
            }
            if (operType == 2){
                int value = data.get(item[1]);
                list.add(value);
                continue;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }


    private void set(Integer key,Integer value,Integer k){
        if (data.containsKey(key)){
            makeRecently(key,value);
            return;
        }
        if (k <= data.size()){
            int oldKey = data.keySet().iterator().next();
            data.remove(oldKey);
        }
        data.put(key,value);
    }

    private int get (Integer key){
        Integer result = data.get(key);
        if (Objects.isNull(result)){
            return -1;
        }
        makeRecently(key,result);
        return result;
    }
    private void makeRecently(Integer key,Integer value){
        data.remove(key);
        data.put(key,value);
    }
}
