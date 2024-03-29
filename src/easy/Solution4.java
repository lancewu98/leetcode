package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it
 * contains. For example, 128 is a self-dividing number because 128 % 1 == 0,
 * 128 % 2 == 0, and 128 % 8 == 0. Also, a self-dividing number is not allowed
 * to contain the digit zero. Given a lower and upper number bound, output a
 * list of every possible self dividing number, including the bounds if
 * possible.
 * 
 * @author LanceWu
 *
 * Example 1: Input: left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */


public class Solution4 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)-'0' == 0)
                {break;}
                else if (i % (s.charAt(j)-'0') != 0)
                {break;}
                else
                {sum++;}
            }
            if (sum == s.length())
            {list.add(i);}
        }

        return list;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
