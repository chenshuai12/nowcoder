package arithmetic;

import java.math.BigInteger;

public class BigData {
    public String solve (String s, String t) {
        // write code here
        int carry=0;
        //String res="";
        char[] res=new char[Math.max(s.length(),t.length())+1];
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        int idx= res.length-1;
        int idx1 = array1.length-1;
        int idx2 = array2.length-1;
        while (idx1>=0||idx2>=0||carry!=0) {
            int num1 = idx1>=0 ? array1[idx1--]-'0' : 0;
            int num2 = idx2>=0 ? array2[idx2--]-'0' : 0;
            //System.out.println(num1);
            //System.out.println(num2);
            int sum=num1+num2+carry;
            //System.out.println(sum);
            carry=sum/10;
            //System.out.println("res"+(char)(sum%10+'0'));
            res[idx--]=(char)(sum%10+'0');
        }

        return idx==0?String.valueOf(res).substring(1):String.valueOf(res);
//        BigInteger bigInteger1 = new BigInteger(s);
//        BigInteger bigInteger2 = new BigInteger(t);
//
//        return bigInteger1.add(bigInteger2).toString();
    }
}
