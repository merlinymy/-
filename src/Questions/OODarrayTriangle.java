package Questions;

import java.util.Arrays;

public class OODarrayTriangle {
    public int[][] createTriangle (int n) {
        /*
        n = 4
        0
        0 0
        0 0 0
        0 0 0 0
         */
        if (n <= 0) return null;
        int[][] res = new int[n][];
        for (int i = 0; i < n; i++) {
            res[i] = new int[i];
        }
        return res;
    }

    public static void main(String[] args) {
        OODarrayTriangle test = new OODarrayTriangle();
        System.out.println(Arrays.deepToString(test.createTriangle(3)));
    }

}
