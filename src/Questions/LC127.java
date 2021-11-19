package Questions;

import java.util.*;


public class LC127 {
    public int wordLadderI(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int minLength = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String cur = queue.poll();
                List<String> nextFewWords = convert(cur);
                for (String nextWord : nextFewWords) {
                    if (nextWord.equals(endWord) && set.contains(endWord)) {
                        return minLength + 1;
                    }
                    if (set.remove(nextWord)) {
                        queue.offer(nextWord);
                    }
                }
            }
            minLength++;
        }
        return 0;
    }
    public static List<String> convert(String word) {
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

    public static void main(String[] args) {
        List<String> test = Arrays.asList("hit","hot", "dot", "dog", "lot", "cog");
        String startWord = "hit";
        String endWord = "cog";
        LC127 testing = new LC127();
        int res = testing.wordLadderI(startWord, endWord, test);
        System.out.println(res);
    }
}
