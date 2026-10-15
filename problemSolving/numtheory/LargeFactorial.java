package numtheory;

import java.util.LinkedList;
import java.util.List;

public class LargeFactorial {

    public static void main(String[] args) {

        for(int eachNum : buildComplexFactorial(600)){
            System.out.print(eachNum);
        }
    }

    public static int[] buildComplexFactorial(int n) {

        LinkedList<Integer> intermediatelist = new LinkedList<Integer>();
        intermediatelist.add(1);

        for (int i = 1; i <= n; i++) {

           LinkedList<Integer> out = rebuildIntermediateList(intermediatelist, i);
           intermediatelist.clear();
           intermediatelist.addAll(out);
        }

        return intermediatelist.stream().mapToInt(Integer::intValue).toArray();

    }

    private static LinkedList<Integer> rebuildIntermediateList(LinkedList<Integer> intermediatelist, int num ) {

        LinkedList<Integer> list = new LinkedList<>();

            int remainder = 0;

            for(int i= intermediatelist.size()-1;i>=0;i--){
                int product = intermediatelist.get(i) * num;
                int currdigit = remainder + product;
                list.addFirst(currdigit % 10);
                remainder = currdigit / 10;
            }

            while(remainder > 0){
                list.addFirst(remainder % 10);
                remainder = remainder / 10;
            }
            return list;
    }
}
