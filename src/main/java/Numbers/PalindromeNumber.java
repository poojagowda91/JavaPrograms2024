package Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n , r, sum =0,temp;
        n = 454;
        temp =n;
        while(n>0)
        {
            r = n%10;
            sum = sum *10+r;
            n = n/10;
        }
        if(temp == sum)
        {
            System.out.println("Number is a palindrome = "+temp);
        }else {
            System.out.println("Number is not a palindrome = "+temp);
        }
    }
}
