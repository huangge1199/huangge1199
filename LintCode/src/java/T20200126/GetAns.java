package T20200126;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hyy
 * @Date: 2020-01-26 01:14
 */

public class GetAns {
    /**
     * @param a: the array a
     * @return: return the index of median
     */
    public static int getAns(int[] a) {
        // write your code here
        Map<Integer, Integer> map = new HashMap();
        map.put(a[0],0);
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(i==0){
                    map.put(a[j],j);
                }
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int middle;
        if(a.length%2==0){
            middle = a[a.length/2-1];
        }else{
            middle = a[a.length/2];
        }
        return map.get(middle);
    }

    public static void main(String[] args) {
        int[] a = {101,527,373,526,199,938,915,766,429,951};
        System.out.println(getAns(a));
    }
}
