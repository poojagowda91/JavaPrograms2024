package Leetcode;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        HappyNumber t1 = new HappyNumber();
        boolean status  =  t1.isHappy(23);
        System.out.println(status);
    }

}



