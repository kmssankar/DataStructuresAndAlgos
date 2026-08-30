package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Hindex {
    public static void main(String[] args) {
        
    }

      public int hIndex(int[] citations) {
     Arrays.sort(citations);
         int len = citations.length;
         int hidx=0;
         for(int i=len-1; i >= 0 ; i --){
             if(citations[i] >= hidx+1){
                 hidx ++;
             }else{
                break;
             }
         }
         return hidx;
    }

}
