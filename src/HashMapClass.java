import java.util.HashMap;
import java.util.Map;

// vovel occurence count by using HashMap collection class....
public class HashMapClass {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        String str ="ABCDEFIJKEE";
        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i)))
            {
                int ctr=map.get(str.charAt(i));
                //System.out.println(ctr);
                map.put(str.charAt(i),++ctr);
            }
        }
        System.out.println(map);



    }
}
