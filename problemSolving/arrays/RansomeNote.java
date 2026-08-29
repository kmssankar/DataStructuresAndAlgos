package arrays;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class RansomeNote {

    public static void main(String[] args) {
      System.out.println( canConstruct("aa", "ab"));
    }

     public static boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character, Integer> map = new Hashtable<>();
        char[] magAry = magazine.toCharArray();
        char[] ransomeAry = ransomNote.toCharArray();

        for(char c : magAry){
            if(map.containsKey(c)){
              map.computeIfPresent(c, (key, val) -> val +1);
            }
            else{
                map.computeIfAbsent(c, key -> 1);
            }
        }

        System.out.println(map);
 
        for(char c : ransomeAry){
            if(map.containsKey(c) ){
                int cnt = map.get(c);
                if(cnt > 0){
                    map.put(c,cnt -1 );
                   
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        


        return true;
    }
}
