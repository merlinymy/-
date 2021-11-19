package Questions;

import java.util.*;

public class LC126 {
    public Map<String, List<String>> WLII (String start, String end, HashSet<String> dict) throws Exception {
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        dict.remove(start);
        boolean isOver = false;
        HashMap<String, List<String>> graph = new HashMap<>();//记录边和点 <------------------- \
        while(!queue.isEmpty()){
            int size = queue.size();
            HashSet<String> thisLevelVisited = new HashSet<>();// 记录当前层刚被visited的elements。需要另一个HashMap来记录overallVisited
            while (size-- > 0) {
                String cur = queue.poll();
                List<String> nexts = transform(cur);
                for (String next : nexts){
                    if (next.equals(end)){
                        isOver = true;
                    }

                    if (!dict.contains(next)) {//previously visited or nor in the dictionary
                        continue;
                    }

                    if (!thisLevelVisited.add(cur)) { //visited mark edge
                        List<String> toV = graph.getOrDefault(cur, new ArrayList<>());
                        toV.add(next);
                        graph.put(cur, toV);
                    } else { //not visited
                        queue.offer(next);
                        List<String> toV = graph.getOrDefault (cur, new ArrayList<>());
                        toV.add(next);
                        graph.put(cur, toV);
                    }
                }
            }
            dict.removeAll(thisLevelVisited);

            if (isOver) {
                return graph;
            }
        }
        throw new Exception("no");

    }
    public List<String> transform(String word) {
        List<String> res = new ArrayList<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            for (char aToZ = 'a'; aToZ <= 'z'; aToZ++) {
                chars[i] = aToZ;
                if (cur != chars[i]) {
                    res.add(String.valueOf(chars));
                }
            }
            chars[i] = cur;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        List<String> test = Arrays.asList("hot","dot","dog","lot","log","cog");
        HashSet<String> testSet = new HashSet<>(test);
        String startWord = "hit";
        String endWord = "cog";
        LC126 testing = new LC126();
        Map res = testing.WLII(startWord, endWord, testSet);
        System.out.println(res);
    }
}
