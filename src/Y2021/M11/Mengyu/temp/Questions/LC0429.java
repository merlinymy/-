package Y2021.M11.Mengyu.temp.Questions;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC0429 {

        public List<List<Integer>> NnaryTreeLevelOrderTraverse (Node root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            bfsNnary(root, result);
            return result;
        }
        private void bfsNnary (Node root, List<List<Integer>> result) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> curLevelNodes = new ArrayList<>();
                while (size-- > 0) {
                    Node cur = queue.poll();
                    curLevelNodes.add(cur.val);
                    for (int i = 0; i < cur.children.size(); i++) {
                        queue.offer(cur.children.get(i));
                    }
                }
                result.add(curLevelNodes);
            }
        }

        public static void main(String[] args) {
            Node test = new Node();
            LC0429 method = new LC0429();
            System.out.println(method.NnaryTreeLevelOrderTraverse(test));
        }
    }

