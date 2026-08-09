import java.util.*;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {
        String[] input = {"eat","sat", "tea", "tan","tab", "ate", "nat", "bat"};

        System.out.println(getAnagrams(Arrays.asList(input)));
        getAnag(Arrays.asList(input)).forEach(System.out::println);

    }

   /* Example:

    Input:  ["eat", "tea", "tan", "ate", "nat", "bat", "tab"]
    Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]] */

    public static List<List<String>> getAnag(List<String> inp){
        List<List<String>>  result = new ArrayList<>();
        inp.stream().collect(Collectors.groupingBy(a -> {
            char[] ary = a.toCharArray();
             Arrays.sort(ary);
        return String.valueOf(ary);})).forEach((a,b) -> {
           result.add(b);
        });
        return result;
    }

    public static List<List<String>> getAnagrams(List<String> input) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>>  result = new ArrayList<>();

        for(int i= 0 ; i < input.size() ; i++) {
            if (input.get(i) != null) {
                char[] arr = input.get(i).toCharArray();
                Arrays.sort(arr);

                for (int j = 0; j < input.size(); j++) {
                    if (j != i && (input.get(j) != null)) {
                        char[] compareString = input.get(j).toCharArray();
                        Arrays.sort(compareString);
                        if (Arrays.equals(arr, compareString)) {
                            if (map.containsKey(input.get(i))) {
                                map.get(input.get(i)).add(input.get(j));
                            } else {
                                List<String> list = new ArrayList<>();
                                list.add(input.get(j));
                                map.put(input.get(i), list);
                            }
                            input.set(j, null);
                        }

                    }
                    else{
                        List<String> list = new ArrayList<>();
                        map.put(input.get(i), list);
                    }

                }
            }
        }

        map.forEach((k,v)->{
            List<String> list = new ArrayList<>();
            list.add(k);
            list.addAll(v);
            result.add(list);
        });
        return result;


    }
}
