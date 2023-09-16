package Chapter_basic_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_16 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","A","Z","D"};

        HashMap map = new HashMap();

        for(int i=0; i< data.length; i++) {
            if(map.containsKey(data[i])) { // key를 포함? 포함하면 value++
                int value = (int)map.get(data[i]);
                map.put(data[i],value+1);
            }else {
                map.put(data[i],1);
            }
        }
        Set set = map.entrySet();
        System.out.println(set);
        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int) entry.getValue();
            System.out.println(entry.getKey() +":"+printBar('#',value)+" "+value);
        }
    }
    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0; i<bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);
    }

}
