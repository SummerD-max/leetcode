package array;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * 2023/5/22  20:22
 *
 * @author: Alex
 * @version: 1.0
 */
public class No118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        System.out.println(res);
    }
}
