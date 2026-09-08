package arrays;

import java.util.Hashtable;

public class IsomorphicStrings {

    public static void main(String[] args) {
        
    }

     public boolean isIsomorphic(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int sLength = sArray.length;
        int tLength = tArray.length;
        if (s.equals(t))
            return true;
        if (sLength != tLength)
            return false;
        Hashtable<Character, Character> table = new Hashtable<>();
        for (int i = 0; i < sLength; i++) {
            if(table.containsKey(sArray[i])){
                if((table.get(sArray[i]) != tArray[i])){
                    return false;
                }
            }else if(table.containsValue(tArray[i])){
                return false;
            }else{
                table.put(sArray[i], tArray[i]);
            }
        }
        return true;
    }
}
