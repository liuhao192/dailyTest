package leetcode.LFUCache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/5 21:18
 */
public class LFUCache {
    private static int capacitySize, time;
    Map<Integer, Node> key_table;
    List<Node> s;

    public LFUCache(int capacity) {
        capacitySize = capacity;
        time = 0;
        key_table = new HashMap<>(capacitySize);
        s = new ArrayList<>(capacitySize);
    }

    public int get(int key) {
        if (capacitySize == 0) {
            return -1;
        }
        Node node = key_table.get(key);
        if (node == null) {
            return -1;
        }
        node.cnt += 1;
        node.time = ++time;
        return node.value;
    }

    public void put(int key, int value) {
        if (capacitySize == 0) {
            return;
        }
        Node node = key_table.get(key);
        if (node == null) {
            //查找最近的使用的缓存
            if (key_table.size() == capacitySize) {
                Collections.sort(s);
                Node cache = s.get(0);
                key_table.remove(cache.key);
                s.remove(0);
            }
            Node cache = new Node(1, ++time, key, value);
            key_table.put(key, cache);
            s.add(cache);
        } else {
            Node cache = key_table.get(key);
            cache.cnt += 1;
            cache.time = ++time;
            cache.value = value;
        }
    }

    private class Node implements Comparable<Object> {
        //
        int cnt;
        int time;
        int key;
        int position;
        int value;

        public Node(int cnt, int time, int key, int value) {
            this.cnt = cnt;
            this.time = time;
            this.key = key;
            this.value = value;
        }


        @Override
        public int compareTo(Object o1) {
            Node emp1 = (Node) o1;
            boolean result = cnt == emp1.cnt ? time < emp1.time : cnt < emp1.cnt;
            if (result) {
                return -1;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.key_table.keySet());
        int res1 = cache.get(1);
        System.out.println(res1);
        cache.put(3, 3);
        System.out.println(cache.key_table.keySet());
        int res2 = cache.get(2);
        System.out.println(res2);
        int res3 = cache.get(3);
        System.out.println(res3);
        cache.put(4, 4);
        System.out.println(cache.key_table.keySet());
        int res4 = cache.get(1);
        System.out.println(res4);
        int res5 = cache.get(3);
        System.out.println(res5);
        int res6 = cache.get(4);
        System.out.println(res6);
    }
}
