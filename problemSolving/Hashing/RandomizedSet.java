package Hashing;

//https://leetcode.com/problems/insert-delete-getrandom-o1
import java.util.*;

public class RandomizedSet {

    private static HashMap<Integer,Integer> map = new HashMap<>();
    private static LinkedList<Integer> list = new LinkedList<>();
    private static Random random = new Random();
    int size = 0;

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val, size);
        size ++;
        list.addLast(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }

        if(size > 0) {
            int indexToRemove = map.get(val);
            int element = list.getLast();
            list.set(indexToRemove, element);
            map.put(element, indexToRemove);
        }
        list.removeLast();
        map.remove(val);
        size --;
        return true;
    }

    public int getRandom() {
        int randomInt = random.nextInt(size);
        return list.get(randomInt);
    }
}
