package stringproblems;

public class CharAppearsTwice {

    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s) {

        int[] idxArray = new int[26];
        char[] inpArray = s.toCharArray();
        int len = inpArray.length;
        for(int i=0; i< len; i++){

            int idx = inpArray[i] - 'a';
            if(idxArray[idx]> 0 ){
                return inpArray[i];
            }else{
                idxArray[idx] = 1;
            }
        }
        return ' ';
    }

}
