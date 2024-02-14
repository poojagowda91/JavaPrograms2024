package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                result[0] = (Integer)map.get(nums[i]);
                result[1] = i;
                return result;
            }

            map.put(target - nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        Arrays.stream(res).forEach(index -> System.out.println(index));
    }
}
